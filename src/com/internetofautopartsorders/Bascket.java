package com.internetofautopartsorders;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrew on 14.03.2017.
 */
public class Basket {
    private final List<Item> items = new ArrayList<>();
    private double bascketSum;
    private final Client client;

    public Basket(Client client) {
        this.client = client;
    }
}
