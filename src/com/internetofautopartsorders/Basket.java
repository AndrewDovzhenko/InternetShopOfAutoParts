package com.internetofautopartsorders;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrew on 14.03.2017.
 */
public class Basket {
    private final List<BasketOrderPosition> items = new ArrayList<>();
    private final Client client;
    private long bascketSum;
    private Discount discount;

    public Basket(Client client) {
        this.client = client;
    }

    public Basket addPosition(Item item, int quantity){
        items.add(new BasketOrderPosition(item, quantity));

        return this;
    }

    public long getBasketSum(){
       long result = 0;
        for (BasketOrderPosition position : items) {
            discount.calculatePrice(position);
        }
    }

}
