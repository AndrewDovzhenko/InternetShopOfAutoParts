package com.internetofautoparts;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrew on 14.03.2017.
 */
public class Order {
    public static int newId;

    private final int id;
    private final List<BasketOrderPosition> items = new ArrayList<>();
    private final long orderSum;

    public Order(Basket basket){
        id = ++newId;
        orderSum = 0;
    }

    public int getId() {
        return id;
    }
}
