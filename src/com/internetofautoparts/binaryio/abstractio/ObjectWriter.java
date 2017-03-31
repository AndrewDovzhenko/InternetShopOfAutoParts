package com.internetofautoparts.binaryio.abstractio;

import java.io.Closeable;
import java.io.IOException;

/**
 * Created by Andrew on 29.03.2017.
 */
public interface ObjectWriter<T> extends Closeable {

    void write(T elem) throws IOException;

}
