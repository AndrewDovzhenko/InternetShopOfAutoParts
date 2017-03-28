package com.internetofautoparts.discounts;

import com.internetofautoparts.basketorder.BasketOrderPosition;
import com.internetofautoparts.itemlibrary.Item;

/**
 * Created by Andrew on 13.03.2017.
 */
public class ZeroDiscount implements Discount {


    @Override
    public long calculatePrice(Item item) {
        return item.getPrice();
    }

    @Override
    public long calculateBasketPositionSum(BasketOrderPosition position) {
        return position.getItem().getPrice()*position.getQuantity();
    }

    @Override
    public long getCurrenPercentOfDiscount() {
        return 0;
    }
}
