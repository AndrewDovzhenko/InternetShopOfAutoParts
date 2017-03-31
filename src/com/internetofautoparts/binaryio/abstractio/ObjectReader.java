package com.internetofautoparts.binaryio.abstractio;

import java.io.Closeable;
import java.io.IOException;
import java.util.IllegalFormatException;

/**
 * Created by Andrew on 29.03.2017.
 */
public interface ObjectReader<T> extends Closeable {

    T read() throws IOException;

}
