package com.internetofautopartsorders;

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
