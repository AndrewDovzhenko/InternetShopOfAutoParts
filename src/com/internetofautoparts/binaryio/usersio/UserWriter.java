package com.internetofautoparts.binaryio.usersio;

import com.internetofautoparts.binaryio.abstractio.AbstractObjectWriter;
import com.internetofautoparts.userdata.User;

import java.io.IOException;
import java.io.ObjectOutput;
import java.io.OutputStream;

/**
 * Created by Andrew on 31.03.2017.
 */
public class UserWriter extends AbstractObjectWriter<User> {

    public UserWriter(ObjectOutput objectOutput){
        super(objectOutput);
    };

    public UserWriter(OutputStream outputStream) throws IOException {
        super(outputStream);
    }

    @Override
    public void write(User user) throws IOException {
        objectOutput.writeObject(user);
    }

}
