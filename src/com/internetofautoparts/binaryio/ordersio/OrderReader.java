package com.internetofautoparts.binaryio.ordersio;

import com.internetofautoparts.basketorder.Order;
import com.internetofautoparts.binaryio.abstractio.AbstractObjectReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;

/**
 * Created by Andrew on 31.03.2017.
 */
public class OrderReader extends AbstractObjectReader<Order> {


    public OrderReader(ObjectInput objectInput) {
        super(objectInput);
    }

    public OrderReader(InputStream inputStream) throws IOException {
        super(inputStream);
    }

    @Override
    public Order read() throws IOException {
        try {
            return (Order) objectInput.readObject();
        } catch (ClassNotFoundException e) {
            throw new IOException("Order class cannot be found", e);
        }
    }
}
