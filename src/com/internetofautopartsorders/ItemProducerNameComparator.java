import java.util.Comparator;

public class ItemProducerNameComparator implements Comparator<Item>{
    @Override
    public int compare(Item item1, Item item2) {
        return item1.getItemProducer().getName().compareTo(item2.getItemProducer().getName());
    }

    @Override
    public Comparator<Item> reversed() {
        return null;
    }
}
