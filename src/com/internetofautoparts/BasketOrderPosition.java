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

    public void addPosition(int quantity){
        this.quantity += quantity;
    }

    public Item getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Position{ item=" + item +", quantity=" + quantity +'}';
    }
}
