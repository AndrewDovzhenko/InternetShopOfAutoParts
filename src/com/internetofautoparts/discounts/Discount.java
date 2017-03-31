package com.internetofautoparts.discounts;

import com.internetofautoparts.basketorder.BasketOrderPosition;
import com.internetofautoparts.itemlibrary.Item;

import java.io.Serializable;

/**
 * Created by Andrew on 13.03.2017.
 */
public interface Discount extends Serializable{
    long calculatePrice(Item item);

    long calculateBasketPositionSum(BasketOrderPosition position);

    long getCurrenPercentOfDiscount();
}
