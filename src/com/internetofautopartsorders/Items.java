import javax.management.ObjectName;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Items {

    public static void main(String[] args) {

        List<Item> itemList = new ArrayList<>();

        itemList.add(new Item(1, 75.99, ItemType.ENGINE, new ItemProducer("AUTOPART", "0973755912")));
        itemList.add(new Item(2, 25.00, ItemType.ENGINE, new ItemProducer("EUROSTANDART", "0632594185")));
        itemList.add(new Item(3, 50.00, ItemType.CHASSIS, new ItemProducer("AUTOPART", "0973755912")));
        itemList.add(new Item(4, 33.25, ItemType.ELECTRICS, new ItemProducer("ELECKTOSVIT", "0501234567")));
        itemList.add(new Item(5, 125.99, ItemType.CARBODY, new ItemProducer("FORYOURCAR", "0932580025")));
        itemList.add(new Item(6, 13.99, ItemType.ELECTRICS, new ItemProducer("MEGADRIVER", "0681998574")));
        itemList.add(new Item(7, 66.33, ItemType.CHASSIS, new ItemProducer("EUROSTANDART", "0632594185")));
        itemList.add(new Item(8, 2.99, ItemType.ELECTRICS, new ItemProducer("MEGADRIVER", "0681998574")));
        itemList.add(new Item(9, 155.99, ItemType.CARBODY, new ItemProducer("FORYOURCAR", "0932580025")));
        itemList.add(new Item(10, 500.00, ItemType.ENGINE, new ItemProducer("AUTOPART", "0973755912")));
        itemList.add(new Item(11, 5.99, ItemType.ELECTRICS, new ItemProducer("ELECKTOSVIT", "0501234567")));
        itemList.add(new Item(12, 250.99, ItemType.TRANSMISSION, new ItemProducer("AUTOPART", "0973755912")));
        itemList.add(new Item(13, 359.50, ItemType.TRANSMISSION, new ItemProducer("EUROSTANDART", "0632594185")));
        itemList.add(new Item(14, 89.99, ItemType.ENGINE, new ItemProducer("AUTOPART", "0973755912")));
//
//        System.out.println(getByItemType(ItemType.CHASSIS, itemList));
//        System.out.println(getByPrice(itemList, 100.00,500.00));
//        System.out.println(getByItemProducerName(itemList,"AUTOPART"));

//        Collections.sort(itemList, new ItemPriceComparator());
//        Collections.sort(itemList,new ItemTypeComparator());
        Collections.sort(itemList,new ItemProducerNameComparator());
        for (Item elem: itemList){
            System.out.println(elem);
        }


    }

    public static List<Item> getByItemType(ItemType itemtype, List<Item> itemList) {
        List<Item> result = new ArrayList<>();
        for (Item elem : itemList) {
            if (itemtype.equals(elem.getItemtype()))
                result.add(elem);
        }
        return result;
    }

    public static List<Item> getByPrice(List<Item> itemList, double from, double to) {
        List<Item> result = new ArrayList<>();
        for (Item elem : itemList) {
            if (elem.getPrice() >= from && elem.getPrice() <= to) {
                result.add(elem);
            }
        }
        return result;
    }

    public static List<Item> getByItemProducerName(List<Item> itemList, String itemproducername) {
        List<Item> result = new ArrayList<>();
        for (Item elem : itemList) {
            if (elem.getItemProducer().getName().equals(itemproducername)) {
                result.add(elem);
            }
        }
        return result;
    }

}
