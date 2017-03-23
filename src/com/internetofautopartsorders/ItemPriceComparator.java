import java.util.Comparator;

public class ItemPriceComparator implements Comparator<Item> {
    @Override
    public int compare(Item item1, Item item2) {
        Double price1 = item1.getPrice();
        Double price2 = item2.getPrice();
        return price1.compareTo(price2);
    }
}
