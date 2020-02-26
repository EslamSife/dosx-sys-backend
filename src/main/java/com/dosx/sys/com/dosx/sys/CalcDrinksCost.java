package com.dosx.sys.com.dosx.sys;

import java.math.BigDecimal;
import java.util.Date;

public class CalcDrinksCost {


    private Integer count;
    private BigDecimal quantity;
    private String drinkName;
    private String drinkType;
    private Integer IndomyCount;
    private BigDecimal costOfIndomy;
    private Integer IndomyInStock;


    /*

    public static void main(String[] args) {
       BigDecimal indomyRevenue =  doCalcIndomySales(100);
       System.out.println(indomyRevenue);
    }

    */



    static protected BigDecimal doCalcIndomySales(Integer sales) {
        BigDecimal itemRevenue = DrinksPrices.INDOMY_PRICE_SALES.multiply(new BigDecimal(sales));
        return itemRevenue;
    }

    protected void purchaseIndomy(Integer quantity) {
        setIndomyInStock(quantity);
    }

    private Integer getIndomyQuantity(Date fromDate, Date toDate) {
        Integer indomyInStock = getIndomyInStock();
        return indomyInStock;
    }


    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public String getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(String drinkType) {
        this.drinkType = drinkType;
    }

    public Integer getIndomyCount() {
        return IndomyCount;
    }

    public void setIndomyCount(Integer indomyCount) {
        IndomyCount = indomyCount;
    }

    public BigDecimal getCostOfIndomy() {
        return costOfIndomy;
    }

    public void setCostOfIndomy(BigDecimal costOfIndomy) {
        this.costOfIndomy = costOfIndomy;
    }

    public Integer getIndomyInStock() {
        return IndomyInStock;
    }

    public void setIndomyInStock(Integer indomyInStock) {
        IndomyInStock = indomyInStock;
    }
}
