package com.internetofautoparts.basketorder;

import com.internetofautoparts.discounts.SimpleDiscount;
import com.internetofautoparts.itemlibrary.Item;
import com.internetofautoparts.itemlibrary.ItemProducer;
import com.internetofautoparts.itemlibrary.ItemType;
import com.internetofautoparts.userdata.Client;
import com.internetofautoparts.userdata.User;
import com.internetofautoparts.userdata.UserType;

/**
 * Created by Andrew on 28.03.2017.
 */
public class BasketOrderRunner {

    public static void main(String[] args) {

        User defUser = new User("defuser","12345@54321", UserType.CLIENT);
        Client johnsmith = new Client("John","Smith", defUser);
        Basket b1 = new Basket(johnsmith);
        b1.addPosition(new Item(1, 7500, ItemType.ENGINE, new ItemProducer("AUTOPART", "0973755912")), 2);
        b1.addPosition(new Item(2, 2500, ItemType.ENGINE, new ItemProducer("EUROSTANDART", "0632594185")),5);

        System.out.println("BasketSum = [" + b1.getBasketSum() + "]");

        Order order = b1.toOrder();
        System.out.println("OrderSum = [" + order.getOrderSum() + "]");


        Basket b2 = new Basket(johnsmith, new SimpleDiscount(10));
        b2.addPosition(new Item(1, 7500, ItemType.ENGINE, new ItemProducer("AUTOPART", "0973755912")), 2);
        b2.addPosition(new Item(2, 2500, ItemType.ENGINE, new ItemProducer("EUROSTANDART", "0632594185")),5);
        System.out.println("BasketSum = [" + b2.getBasketSum() + "]");

        Order order2 = b2.toOrder();
        System.out.println("OrderSum = [" + order2.getOrderSum() + "]");


    }
}
