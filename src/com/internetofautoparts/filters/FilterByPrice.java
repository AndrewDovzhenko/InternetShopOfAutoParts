package com.internetofautoparts.filters;

import com.internetofautoparts.itemlibrary.Item;

public class FilterByPrice implements Filter<Item> {


    private final long from;
    private final long to;

    public FilterByPrice(long from, long to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean filter(Item item) {
        return item.getPrice() >= from && item.getPrice() <= to;
    }
}
