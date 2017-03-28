package com.internetofautoparts.filters;

import com.internetofautoparts.itemlibrary.Item;

public class FilterByProducerName  implements Filter<Item>{

    private final String itemProducerName;

    public FilterByProducerName(String itemProducerName) {
        this.itemProducerName = itemProducerName;
    }

    @Override
    public boolean filter(Item item) {
        return item.getItemProducer().getName().equals(itemProducerName);
    }
}
