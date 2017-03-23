package com.internetofautoparts;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrew on 14.03.2017.
 */
public class Basket {

    private final List<BasketOrderPosition> positions;
    private final Client client;

    private Discount discount;

    public Basket(Client client) {
        this.client = client;
        positions = new ArrayList<>();

    }

    public long getBasketSum(){
       long result = 0;
        for (BasketOrderPosition position : positions) {
            result += discount.calculatePrice(position);
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
    public String toString() {
        return "Basket{" +
                "client=" + client +
                ", positions=" + positions +
                ", discount=" + discount +
                '}';
    }

}
