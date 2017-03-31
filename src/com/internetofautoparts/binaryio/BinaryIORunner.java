package com.internetofautoparts.binaryio;

import com.internetofautoparts.basketorder.Basket;
import com.internetofautoparts.basketorder.Order;
import com.internetofautoparts.binaryio.abstractio.ObjectReader;
import com.internetofautoparts.binaryio.abstractio.ObjectWriter;
import com.internetofautoparts.binaryio.clientio.ClientReader;
import com.internetofautoparts.binaryio.clientio.ClientWriter;
import com.internetofautoparts.binaryio.ordersio.OrderReader;
import com.internetofautoparts.binaryio.ordersio.OrderWriter;
import com.internetofautoparts.binaryio.usersio.UserReader;
import com.internetofautoparts.binaryio.usersio.UserWriter;
import com.internetofautoparts.itemlibrary.Item;
import com.internetofautoparts.itemlibrary.ItemProducer;
import com.internetofautoparts.itemlibrary.ItemType;
import com.internetofautoparts.userdata.Client;
import com.internetofautoparts.userdata.User;
import com.internetofautoparts.userdata.UserType;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Andrew on 29.03.2017.
 */
public class BinaryIORunner {

    public static void main(String[] args) {
        System.out.println("let's start");

        User defUser = new User("defuser","12345@54321", UserType.CLIENT);
        Client johnsmith = new Client("John","Smith", defUser);
        Basket b1 = new Basket(johnsmith);
        b1.addPosition(new Item(1, 7500, ItemType.ENGINE, new ItemProducer("AUTOPART", "0973755912")), 2);
        b1.addPosition(new Item(2, 2500, ItemType.ENGINE, new ItemProducer("EUROSTANDART", "0632594185")),5);

        System.out.println("BasketSum = [" + b1.getBasketSum() + "]");

        Order order = b1.toOrder();
        System.out.println("OrderSum = [" + order.getOrderSum() + "]");

        try {
            writeOrder("./Order1",order);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Order readOrder = null;
        try {
            readOrder = readOrder("./Order1");
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (readOrder!=null)
            System.out.println("OrderSum = [" + readOrder.getOrderSum() + "]");

        try {
            writeUser("./DefUser",defUser);
        } catch (IOException e) {
            e.printStackTrace();
        }

        User readUser = null;
        try {
            readUser = readUser("./DefUser");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void writeOrder(String fileName, Order order) throws IOException {
        try (ObjectWriter<Order> orderWriter = new OrderWriter(new FileOutputStream(fileName))) {
            orderWriter.write(order);
        }
    }


    public static Order readOrder(String fileName) throws IOException {
        try (ObjectReader<Order> orderReader = new OrderReader(new FileInputStream(fileName))){
            return (Order) orderReader.read();
        }
    }

    public static void writeClient(String fileName, Client client) throws IOException {
        try (ObjectWriter<Client> orderWriter = new ClientWriter(new FileOutputStream(fileName))) {
            orderWriter.write(client);
        }
    }


    public static Client readClient(String fileName) throws IOException {
        try (ObjectReader<Client> clientReader = new ClientReader(new FileInputStream(fileName))){
            return (Client) clientReader.read();
        }
    }

    public static void writeUser(String fileName, User user) throws IOException {
        try (ObjectWriter<User> userWriter = new UserWriter(new FileOutputStream(fileName))) {
            userWriter.write(user);
        }
    }


    public static User readUser(String fileName) throws IOException {
        try (ObjectReader<User> userReader = new UserReader(new FileInputStream(fileName))){
            return (User) userReader.read();
        }
    }

}
