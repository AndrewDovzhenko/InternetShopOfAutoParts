package com.internetofautoparts;

/**
 * Created by Andrew on 13.03.2017.
 */
public interface Discount {
    long calculatePrice(BasketOrderPosition position);

    long getCurrenPercentOfDiscount();
}
