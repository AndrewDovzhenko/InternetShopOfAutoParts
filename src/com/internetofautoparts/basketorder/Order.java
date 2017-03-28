package com.internetofautoparts.basketorder;

import com.internetofautoparts.userdata.Client;
import com.internetofautoparts.discounts.Discount;

import java.util.List;

/**
 * Created by Andrew on 14.03.2017.
 */
public class Order {
    public static int newId;

    private final int id;
    private final List<BasketOrderPosition> positions;
    private final Client client;



    private final long orderSum;
    private final Discount discount;

    public Order(Basket basket){
        id = ++newId;
        orderSum = basket.getBasketSum();
        positions = basket.getPositions();
        discount = basket.getDiscount();
        client = basket.getClient();
    }

    public int getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public long getOrderSum() {
        return orderSum;
    }

}
