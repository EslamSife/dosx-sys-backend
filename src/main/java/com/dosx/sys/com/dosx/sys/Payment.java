package com.dosx.sys.com.dosx.sys;

import java.math.BigDecimal;

public class Payment {

    BigDecimal itemCost  = BigDecimal.ZERO;
    BigDecimal totalCost = BigDecimal.ZERO;

    public BigDecimal calculateCost(int itemQuantity, BigDecimal itemPrice)
    {
        itemCost  = itemPrice.multiply(new BigDecimal(itemQuantity));
        totalCost = totalCost.add(itemCost);
        return totalCost;
    }
}
