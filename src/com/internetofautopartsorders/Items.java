import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Items {


    private final List<Item> itemList = new ArrayList<>();

    public List<Item> getItemList() {
        return itemList;
    }

    public List<Item> addItem(Item item) {
        itemList.add(item);
        return itemList;
    }
    public List<Item> sortBy(Comparator comparator){
        Collections.sort(itemList,comparator);
        return itemList;
    }

    public List<Item> getByFilter(Filter filter){
        List<Item> result = new ArrayList<>();
        for (Item elem : itemList) {
            if (filter.filter(elem))
                result.add(elem);
        }
        return result;
    }

    @Override
    public String toString() {
        return "Items{" +
                "itemList=" + itemList +
                '}';
    }


}
