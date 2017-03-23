package com.internetofautoparts;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrew on 14.03.2017.
 */
public class Basket {
    private final List<BasketOrderPosition> positions;
    private final Client client;
    private long bascketSum;
    private Discount discount;

    public Basket(Client client) {
        this.client = client;
        positions = new ArrayList<>();

    }

    public Basket addPosition(Item item, int quantity){
        positions.add(new BasketOrderPosition(item, quantity));

        return this;
    }

    public long getBasketSum(){
       long result = 0;
        for (BasketOrderPosition position : positions) {
            result += discount.calculatePrice(position);
        }
        return result;
    }

}
