package com.internetofautoparts.binaryio.abstractio;

import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * Created by Andrew on 31.03.2017.
 */
public abstract class AbstractObjectWriter<T> implements ObjectWriter<T> {
    protected final ObjectOutput objectOutput;

    public AbstractObjectWriter(ObjectOutput objectOutput){
        this.objectOutput = objectOutput;
    };

    public AbstractObjectWriter(OutputStream outputStream) throws IOException {
        this((ObjectOutput) new ObjectOutputStream(outputStream));
    }

    @Override
    public void close() throws IOException {
        if (objectOutput != null)
            objectOutput.close();
    }
}
