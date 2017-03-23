package com.internetofautoparts;

import java.util.Comparator;

/**
 * Created by Andrew on 24.03.2017.
 */
public class ClientComparator implements Comparator<Client> {

    @Override
    public int compare(Client o1, Client o2) {
        return o1.getId() - o2.getId();
    }
}
