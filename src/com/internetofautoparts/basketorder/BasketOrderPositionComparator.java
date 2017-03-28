package com.internetofautoparts.basketorder;

import com.internetofautoparts.ItemIdComparator;

import java.util.Comparator;

/**
 * Created by Andrew on 23.03.2017.
 */
public class BasketOrderPositionComparator implements Comparator<BasketOrderPosition>{

    @Override
    public int compare(BasketOrderPosition o1, BasketOrderPosition o2) {
        return new ItemIdComparator().compare(o1.getItem(), o2.getItem());
    }
}
