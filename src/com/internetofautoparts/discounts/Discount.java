package com.internetofautoparts.discounts;

import com.internetofautoparts.basketorder.BasketOrderPosition;

/**
 * Created by Andrew on 13.03.2017.
 */
public interface Discount {
    long calculatePrice(BasketOrderPosition position);

    long getCurrenPercentOfDiscount();
}
