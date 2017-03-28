package com.internetofautoparts.filters;

import com.internetofautoparts.basketorder.Order;
import com.internetofautoparts.userdata.Client;

/**
 * Created by Andrew on 24.03.2017.
 */
public class OrderFilterByClient implements Filter<Order> {

    private Client client;

    public OrderFilterByClient(Client client){
        this.client = client;
    }

    @Override
    public boolean filter(Order order) {

        return order.getClient() == client;
    }
}
