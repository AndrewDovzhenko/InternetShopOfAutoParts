package com.internetofautoparts.binaryio.ordersio;

import com.internetofautoparts.basketorder.Order;
import com.internetofautoparts.binaryio.abstractio.AbstractObjectWriter;

import java.io.IOException;
import java.io.ObjectOutput;
import java.io.OutputStream;

/**
 * Created by Andrew on 29.03.2017.
 */
public class OrderWriter extends AbstractObjectWriter<Order> {

    public OrderWriter(ObjectOutput objectOutput){
        super(objectOutput);
    };

    public OrderWriter(OutputStream outputStream) throws IOException {
        super(outputStream);
    }

    @Override
    public void write(Order order) throws IOException {
        objectOutput.writeObject(order);
    }

}
