package com.internetofautoparts.io.Procedural;

import com.internetofautoparts.io.IllegalFormatException;
import com.internetofautoparts.itemlibrary.Item;
import com.internetofautoparts.itemlibrary.ItemProducer;
import com.internetofautoparts.itemlibrary.ItemType;
import com.internetofautoparts.itemlibrary.Items;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class IORunner {
    public static void main(String[] args) throws IOException, IllegalFormatException {
        List<Item> items = new ArrayList<>();
        items.add(new Item(10, 122, ItemType.CHASSIS, new ItemProducer("SVITAUTO,", "0955854595")));
        items.add(new Item(11, 322, ItemType.ENGINE, new ItemProducer("ELECTROSTAR", "0952596321")));
        items.add(new Item(12, 666, ItemType.ELECTRICS, new ItemProducer("YOURCAR", "0675523665")));

        items.add(ItemsIOUtil.readItemFromFile("F://items.txt"));
        System.out.println(items);
        ItemsIOUtil.writeItemsIntoFile("F://myitems.txt", items);

    }
}

