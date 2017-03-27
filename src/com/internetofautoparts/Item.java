package com.internetofautoparts;

public class Item{
    private static int newId;

    private final int id;
    private final long price;
    private final ItemType itemtype;
    private final ItemProducer itemProducer;

    public Item(int id, long price, ItemType itemtype, ItemProducer itemProducer) {
        this.id = ++newId;
        this.price = price;
        this.itemtype = itemtype;
        this.itemProducer = itemProducer;
    }
    public int getId() {
        return id;
    }

    public long getPrice() {
        return price;
    }

    public ItemType getItemtype() {
        return itemtype;
    }

    public ItemProducer getItemProducer() {
        return itemProducer;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", price='" + price + '\'' +
                ", itemtype=" + itemtype +
                ", itemProducer=" + itemProducer +
                '}'+"\n";
    }
}