package com.internetofautoparts.binaryio.abstractio;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

/**
 * Created by Andrew on 31.03.2017.
 */
public abstract class AbstractObjectReader<T> implements ObjectReader<T>{

    protected final ObjectInput objectInput;

    public AbstractObjectReader(ObjectInput objectInput) {
        this.objectInput = objectInput;
    }

    public AbstractObjectReader(InputStream inputStream) throws IOException {
        this((ObjectInput) new ObjectInputStream(inputStream));
    }

    @Override
    public void close() throws IOException {
        if (objectInput != null)
            objectInput.close();
    }
}
