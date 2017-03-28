package com.internetofautoparts.itemlibrary;

import com.internetofautoparts.filters.Filter;

import java.util.*;

public class Items implements Iterable<Item>{
    private final List<Item> itemList = new ArrayList<>();

    public Items(List<Item> arrayList) {
        for (Item elem : arrayList) {
            itemList.add(elem);
        }
    }

    public Items() {
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void addItem(Item item) {
        itemList.add(item);
    }

    public List<Item> sortBy(Comparator comparator) {
        Collections.sort(itemList, comparator);
        return itemList;
    }

    public Items filter(Filter filter) {
        Items result = new Items();
        for (Item elem : itemList) {
            if (filter.filter(elem))
                result.addItem(elem);
        }
        return result;
    }

    public Items filter2(Filter filter) {
        List<Item> result = new ArrayList();
        for (Item elem : itemList) {
            if (filter.filter(elem))
                result.add(elem);
        }
        return new Items(result);
    }

    @Override
    public String toString() {
        return "Items{" +
                "itemList=" + itemList +
                '}';
    }

    @Override
    public Iterator<Item> iterator() {
        return itemList.iterator();
    }
}
