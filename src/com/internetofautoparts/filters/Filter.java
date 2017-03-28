package com.internetofautoparts.filters;

public interface Filter<T> {
    boolean filter(T elements);
}
