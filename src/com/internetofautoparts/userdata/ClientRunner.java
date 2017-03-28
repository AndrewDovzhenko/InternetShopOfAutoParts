package com.internetofautoparts.userdata;

import com.internetofautoparts.discounts.Discount;
import com.internetofautoparts.discounts.ZeroDiscount;
import com.internetofautoparts.basketorder.Basket;
import com.internetofautoparts.basketorder.Order;

/**
 * Created by Andrew on 13.03.2017.
 */
public class ClientRunner {

    public static void main(String[] args) {
        Discount discount = new ZeroDiscount();
        User user = new User("JS0911","1111", UserType.ADMINISTRATOR);
        Client client = new Client("John", "Smith", user, discount);
        Basket basket = new Basket(client);
        new Order(basket);

    }
}
