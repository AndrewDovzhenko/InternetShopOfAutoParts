package com.internetofautoparts.itemlibrary;

import java.util.Comparator;

/**
 * Created by Andrew on 23.03.2017.
 */
public class ItemIdComparator implements Comparator<Item> {

    @Override
    public int compare(Item item, Item item2) {
        return item.getId()-item2.getId();
    }
}
