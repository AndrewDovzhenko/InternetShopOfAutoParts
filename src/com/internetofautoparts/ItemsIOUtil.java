package com.internetofautoparts.io.Procedural;

import com.internetofautoparts.io.IllegalFormatException;
import com.internetofautoparts.itemlibrary.Item;
import com.internetofautoparts.itemlibrary.ItemProducer;
import com.internetofautoparts.itemlibrary.ItemType;

import java.io.*;
import java.util.List;

public class ItemsIOUtil {

    public ItemsIOUtil() {
    }


    public static Item readItemFromFile(String fileName) throws IOException, IllegalFormatException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return readItem(reader);
        }
    }

    public static Item readItem(BufferedReader reader) throws IOException, IllegalFormatException {
        String line = reader.readLine();
        return parseItem(line);
    }

    public static void writeItemsIntoFile(String fileName, List<Item> items) throws FileNotFoundException {
        try (PrintWriter writer = new PrintWriter(new File(fileName))) {
            writeItems(writer, items);
        }
    }

    public static void writeItems(PrintWriter writer, List<Item> items) {
        for (Item item : items) {
            writer.println(item.toOutputString());
        }
    }

    public static final String CSV_DELIMITER = ";";

    public static Item parseItem(String line) throws IllegalFormatException {
        String[] tokens = line.split(CSV_DELIMITER);

        if (tokens.length<4){
            throw new IllegalFormatException("Not enough values. Example (id;price;itemType;producerName,producerContact): " + line);
        }


        int id = Integer.parseInt(tokens[0].trim());

        long price = Long.parseLong(tokens[1].trim());


        ItemType itemTypeEnum = parseItemType(tokens[2].trim());
        if (itemTypeEnum == null) {
            return null;
        }

        ItemProducer itemProducer = parseItemProducer(tokens[3].trim());


        return new Item(id, price, itemTypeEnum, itemProducer);
    }

    public static ItemType parseItemType(String str) {
        for (ItemType itemType : ItemType.values()) {
            if (itemType.toString().equals(str.toUpperCase())) {
                return itemType;
            }
        }
        return null;
    }

    public static ItemProducer parseItemProducer(String str) {
        String[] itemProducertokens = str.split(",");
        String name = itemProducertokens[0];
        String contacts = itemProducertokens[1];
        return new ItemProducer(name, contacts);
    }


}
