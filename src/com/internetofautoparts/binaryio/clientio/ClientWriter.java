package com.internetofautoparts.binaryio.clientio;

import com.internetofautoparts.binaryio.abstractio.AbstractObjectWriter;
import com.internetofautoparts.userdata.Client;

import java.io.IOException;
import java.io.ObjectOutput;
import java.io.OutputStream;

/**
 * Created by Andrew on 01.04.2017.
 */
public class ClientWriter extends AbstractObjectWriter<Client> {

    public ClientWriter(ObjectOutput objectOutput) {
        super(objectOutput);
    }

    public ClientWriter(OutputStream outputStream) throws IOException {
        super(outputStream);
    }

    @Override
    public void write(Client client) throws IOException {
        objectOutput.writeObject(client);
    }
}
