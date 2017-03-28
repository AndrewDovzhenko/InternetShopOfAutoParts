package com.internetofautoparts.discounts;

import com.internetofautoparts.basketorder.BasketOrderPosition;
import com.internetofautoparts.itemlibrary.Item;

/**
 * Created by Andrew on 28.03.2017.
 */
public class SimpleDiscount implements Discount {

    private final long discountPercent;

    public SimpleDiscount(long discountPercent) {
        this.discountPercent = discountPercent;
    }

    @Override
    public long calculatePrice(Item item) {
        return item.getPrice()*discountPercent/100;
    }

    @Override
    public long calculateBasketPositionSum(BasketOrderPosition position) {
        return position.getItem().getPrice()*position.getQuantity()*discountPercent/100;
    }

    @Override
    public long getCurrenPercentOfDiscount() {
        return discountPercent;
    }
}
