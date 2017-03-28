package com.internetofautoparts.filters;

import com.internetofautoparts.itemlibrary.Item;
import com.internetofautoparts.itemlibrary.ItemType;

public class FilterByItemType implements Filter<Item> {

    private ItemType itemType;

    public FilterByItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    @Override
    public boolean filter(Item item) {
        return itemType.equals(item.getItemtype());
    }
}
