package com.internetofautoparts;

public class FilterByItemType implements Filter {

    private ItemType itemType;

    public FilterByItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    @Override
    public boolean filter(Item item) {
        return itemType.equals(item.getItemtype());
    }
}
