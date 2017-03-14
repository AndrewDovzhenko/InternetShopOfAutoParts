package com.internetofautopartsorders;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrew on 14.03.2017.
 */
public class Order {
    public static int newId;

    private final int id;
    private final List<Item> items = new ArrayList<Item>();
    private final double orderSum;

    public Order(Basket basket){
        id = ++newId;
        orderSum = 0;
    }

}
