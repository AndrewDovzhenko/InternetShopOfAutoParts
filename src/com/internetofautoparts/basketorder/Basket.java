package com.internetofautoparts.basketorder;

import com.internetofautoparts.discounts.ZeroDiscount;
import com.internetofautoparts.userdata.Client;
import com.internetofautoparts.discounts.Discount;
import com.internetofautoparts.itemlibrary.Item;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Andrew on 14.03.2017.
 */
public class Basket implements Iterable<BasketOrderPosition> {

    private final List<BasketOrderPosition> positions;
    private final Client client;

    private Discount discount;

    public Basket(Client client) {
        this.client = client;
        positions = new ArrayList<>();
        discount = new ZeroDiscount();
    }

    public Basket(Client client, Discount discount) {
        this.client = client;
        positions = new ArrayList<>();
        this.discount = discount;

    }

    public long getBasketSum(){
       long result = 0;
        for (BasketOrderPosition position : positions) {
            result += discount.calculateBasketPositionSum(position);
        }
        return result;
    }

    public List<BasketOrderPosition> getPositions() {
        return positions;
    }

    public Discount getDiscount() {
        return discount;
    }

    public Client getClient() {
        return client;
    }

    public Basket addPosition(Item item, int quantity){
        for (BasketOrderPosition position : positions) {
            if (position.getItem() == item){
                position.addPosition(quantity);
            }
        }
        positions.add(new BasketOrderPosition(item, quantity));

        sortPosition();

        return this;
    }

    public void sortPosition(){
        positions.sort(new BasketOrderPositionComparator());
    }

    public Order toOrder(){
        return new Order(this);
    }

    @Override
    public Iterator<BasketOrderPosition> iterator() {
        return positions.iterator();
    }

    @Override
    public String toString() {
        return "Basket{" +
                "client=" + client +
                ", positions=" + positions +
                ", discount=" + discount +
                '}';
    }

}
