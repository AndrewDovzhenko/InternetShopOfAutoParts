package com.internetofautoparts;

/**
 * Created by Andrew on 24.03.2017.
 */
public class OrderFilterByClient implements OrderFilter {

    private Client client;

    public OrderFilterByClient(Client client){
        this.client = client;
    }

    @Override
    public boolean filter(Order order) {

        return order.getClient() == client;
    }
}
