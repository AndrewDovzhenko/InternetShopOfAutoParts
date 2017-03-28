package com.internetofautoparts.basketorder;

import java.util.Comparator;

/**
 * Created by Andrew on 23.03.2017.
 */
public class OrderComparator implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        return o1.getId()-o2.getId();
    }
}
