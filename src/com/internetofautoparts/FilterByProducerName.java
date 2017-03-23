package com.internetofautoparts;

public class FilterByProducerName  implements Filter{

    private final String itemProducerName;

    public FilterByProducerName(String itemProducerName) {
        this.itemProducerName = itemProducerName;
    }

    @Override
    public boolean filter(Item item) {
        return item.getItemProducer().getName().equals(itemProducerName);
    }
}