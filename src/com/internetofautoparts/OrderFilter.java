package com.internetofautoparts;

import com.internetofautoparts.basketorder.Order;

/**
 * Created by Andrew on 24.03.2017.
 */
public interface OrderFilter {

    boolean filter(Order order);

}
