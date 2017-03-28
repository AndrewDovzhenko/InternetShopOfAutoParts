package com.internetofautoparts.discounts;

import com.internetofautoparts.basketorder.BasketOrderPosition;
import com.internetofautoparts.itemlibrary.Item;

/**
 * Created by Andrew on 13.03.2017.
 */
public interface Discount {
    long calculatePrice(Item item);

    long calculateBasketPositionSum(BasketOrderPosition position);

    long getCurrenPercentOfDiscount();
}
