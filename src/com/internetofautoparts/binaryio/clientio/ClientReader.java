package com.internetofautoparts.binaryio.clientio;

import com.internetofautoparts.basketorder.Order;
import com.internetofautoparts.binaryio.abstractio.AbstractObjectReader;
import com.internetofautoparts.userdata.Client;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;

/**
 * Created by Andrew on 01.04.2017.
 */
public class ClientReader extends AbstractObjectReader<Client> {

    public ClientReader(ObjectInput objectInput) {
        super(objectInput);
    }

    public ClientReader(InputStream inputStream) throws IOException {
        super(inputStream);
    }

    @Override
    public Client read() throws IOException {
        try {
            return (Client) objectInput.readObject();
        } catch (ClassNotFoundException e) {
            throw new IOException("Order class cannot be found", e);
        }
    }
}
