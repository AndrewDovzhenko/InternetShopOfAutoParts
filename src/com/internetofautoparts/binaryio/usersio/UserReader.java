package com.internetofautoparts.binaryio.usersio;

import com.internetofautoparts.binaryio.abstractio.AbstractObjectReader;
import com.internetofautoparts.userdata.User;

import java.io.*;

/**
 * Created by Andrew on 31.03.2017.
 */
public class UserReader extends AbstractObjectReader<User> {

    public UserReader(ObjectInput objectInput) {
        super(objectInput);
    }

    public UserReader(InputStream inputStream) throws IOException {
        super(inputStream);
    }

    @Override
    public User read() throws IOException {
        try {
            return (User) objectInput.readObject();
        } catch (ClassNotFoundException e) {
            throw new IOException("Order class cannot be found", e);
        }
    }
}
