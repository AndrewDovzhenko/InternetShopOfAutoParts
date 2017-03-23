import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ItemsRunner {

    public static void main(String[] args) {

        Items items = new Items();

        items.addItem(new Item(1, 75.99, ItemType.ENGINE, new ItemProducer("AUTOPART", "0973755912")));
        items.addItem(new Item(2, 25.00, ItemType.ENGINE, new ItemProducer("EUROSTANDART", "0632594185")));
        items.addItem(new Item(3, 50.00, ItemType.CHASSIS, new ItemProducer("AUTOPART", "0973755912")));
        items.addItem(new Item(4, 33.25, ItemType.ELECTRICS, new ItemProducer("ELECKTOSVIT", "0501234567")));
        items.addItem(new Item(5, 125.99, ItemType.CARBODY, new ItemProducer("FORYOURCAR", "0932580025")));
        items.addItem(new Item(6, 13.99, ItemType.ELECTRICS, new ItemProducer("MEGADRIVER", "0681998574")));
        items.addItem(new Item(7, 66.33, ItemType.CHASSIS, new ItemProducer("EUROSTANDART", "0632594185")));
        items.addItem(new Item(8, 2.99, ItemType.ELECTRICS, new ItemProducer("MEGADRIVER", "0681998574")));
        items.addItem(new Item(9, 155.99, ItemType.CARBODY, new ItemProducer("FORYOURCAR", "0932580025")));
        items.addItem(new Item(10, 500.00, ItemType.ENGINE, new ItemProducer("AUTOPART", "0973755912")));
        items.addItem(new Item(11, 5.99, ItemType.ELECTRICS, new ItemProducer("ELECKTOSVIT", "0501234567")));
        items.addItem(new Item(12, 250.99, ItemType.TRANSMISSION, new ItemProducer("AUTOPART", "0973755912")));
        items.addItem(new Item(13, 359.50, ItemType.TRANSMISSION, new ItemProducer("EUROSTANDART", "0632594185")));
        items.addItem(new Item(14, 89.99, ItemType.ENGINE, new ItemProducer("AUTOPART", "0973755912")));
//
//        System.out.println(items.getByItemType(ItemType.CHASSIS));
//        System.out.println(items.getByPrice(100.00, 500.00));
//        System.out.println(items.getByItemProducerName("AUTOPART"));

        items.sortBy(new ItemPriceComparator());

        for (Item elem : items.getByFilter(new FilterByProducerName("MEGADRIVER"))) {
            System.out.println(elem);
        }

    }

}
