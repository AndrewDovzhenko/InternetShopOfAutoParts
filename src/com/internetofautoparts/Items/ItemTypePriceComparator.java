import java.util.Comparator;

public class ItemTypePriceComparator implements Comparator<Item> {

    @Override
    public int compare(Item item1, Item item2) {

        int comparator = item1.getItemtype().compareTo(item2.getItemtype());
        if (comparator == 0) {
            return Long.compare(item1.getPrice(), item2.getPrice());
        } else {
            return comparator;
        }
    }
}
