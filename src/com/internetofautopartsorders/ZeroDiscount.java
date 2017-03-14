package com.internetofautopartsorders;

/**
 * Created by Andrew on 13.03.2017.
 */
public class ZeroDiscount implements Discount {
    @Override
    public double calculatePrice() {
        return 0;
    }
}
