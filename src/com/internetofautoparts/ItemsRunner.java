package com.internetofautoparts;

public class ItemsRunner {

    public static void main(String[] args) {

        Items items = new Items();

        items.addItem(new Item(1, 75, ItemType.ENGINE, new ItemProducer("AUTOPART", "0973755912")));
        items.addItem(new Item(2, 25, ItemType.ENGINE, new ItemProducer("EUROSTANDART", "0632594185")));
        items.addItem(new Item(3, 50, ItemType.CHASSIS, new ItemProducer("AUTOPART", "0973755912")));
        items.addItem(new Item(4, 33, ItemType.ELECTRICS, new ItemProducer("ELECKTOSVIT", "0501234567")));
        items.addItem(new Item(5, 125, ItemType.CARBODY, new ItemProducer("FORYOURCAR", "0932580025")));
        items.addItem(new Item(6, 13, ItemType.ELECTRICS, new ItemProducer("MEGADRIVER", "0681998574")));
        items.addItem(new Item(7, 66, ItemType.CHASSIS, new ItemProducer("EUROSTANDART", "0632594185")));
        items.addItem(new Item(8, 2, ItemType.ELECTRICS, new ItemProducer("MEGADRIVER", "0681998574")));
        items.addItem(new Item(9, 155, ItemType.CARBODY, new ItemProducer("FORYOURCAR", "0932580025")));
        items.addItem(new Item(10, 500, ItemType.ENGINE, new ItemProducer("AUTOPART", "0973755912")));
        items.addItem(new Item(11, 5, ItemType.ELECTRICS, new ItemProducer("ELECKTOSVIT", "0501234567")));
        items.addItem(new Item(12, 250, ItemType.TRANSMISSION, new ItemProducer("AUTOPART", "0973755912")));
        items.addItem(new Item(13, 359, ItemType.TRANSMISSION, new ItemProducer("EUROSTANDART", "0632594185")));
        items.addItem(new Item(14, 89, ItemType.ENGINE, new ItemProducer("AUTOPART", "0973755912")));

        items.sortBy(new ItemTypeComparator());

        for (Item elem : items.getByFilter(new FilterByProducerName("MEGADRIVER"))) {
            System.out.println(elem);
        }

    }

}
