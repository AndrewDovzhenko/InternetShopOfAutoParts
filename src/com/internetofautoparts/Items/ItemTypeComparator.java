package com.internetofautoparts;

import java.util.Comparator;

public class ItemTypeComparator implements Comparator<Item> {

    @Override
    public int compare(Item item1, Item item2) {
        Enum<ItemType> o1 = item1.getItemtype();
        Enum<ItemType> o2= item2.getItemtype();
        return o1.compareTo((ItemType) o2);
    }
}
