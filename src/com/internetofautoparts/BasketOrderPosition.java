package com.internetofautoparts;

/**
 * Created by Andrew on 22.03.2017.
 */
public class BasketOrderPosition {
    private final Item item;
    private int quantity;

    public BasketOrderPosition(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public void addPosition(){
        quantity += 1;
    }

    public Item getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }
}
