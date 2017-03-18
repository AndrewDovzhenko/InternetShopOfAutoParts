public class Item{
    private static int newId;

    private final int id;
    private final String price;
    private final Itemtype itemtype;
    private final ItemProducer itemProducer;

    public Item(int id, String price, Itemtype itemtype, ItemProducer itemProducer) {
        this.id = ++newId;
        this.price = price;
        this.itemtype = itemtype;
        this.itemProducer = itemProducer;
    }
}