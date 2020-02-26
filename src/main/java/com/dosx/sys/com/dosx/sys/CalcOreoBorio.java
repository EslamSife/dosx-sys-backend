package com.dosx.sys.com.dosx.sys;

import com.dosx.sys.com.dosx.sys.entity.DrinkItem;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CalcOreoBorio {


    static List<DrinkItem> itemList = new ArrayList<>();
    static List<Integer> oreoInStock = new ArrayList<>();
    static List<Integer> borioInStock = new ArrayList<>();


    public static void main(String[] args) {
        procduceOreo(calcBorioInStock(), calcOreoStock());
        costOfBorioAndOreo(calcBorioInStock(), calcOreoStock(), "SALES");
    }

    static Integer calcBorioInStock() {
        int totalInsideStock = 0;
        borioInStock.add(12);
        borioInStock.add(8);
        borioInStock.add(10);
        borioInStock.add(2);
        borioInStock.add(12);
        borioInStock.add(6);

        for (Integer quantity : borioInStock) {
            totalInsideStock += quantity;
        }
        return totalInsideStock;
    }

    static BigDecimal costOfBorioAndOreo(int qnBorio, int qnOreo, String type) {
        BigDecimal borioCost  = BigDecimal.ZERO;

        BigDecimal borioSales  = BigDecimal.ZERO;

        BigDecimal oreoCost  = BigDecimal.valueOf(3);
        BigDecimal totalCost = BigDecimal.ZERO;
        if(type.equals("SALES")) {
            borioCost  = borioCost.multiply(new BigDecimal(qnBorio));
            oreoCost  = oreoCost.multiply(new BigDecimal(qnOreo));
            totalCost = borioCost.add(oreoCost);
            System.out.println("The total coat is " + totalCost);
        } else {
            borioCost = BigDecimal.valueOf(2);
            borioCost = borioCost.multiply(new BigDecimal(qnBorio));
            oreoCost  = oreoCost.multiply(new BigDecimal(qnOreo));
            totalCost = borioCost.add(oreoCost);
            System.out.println("The total coat is " + totalCost);
        }
        return totalCost;
    }

    static Integer calcOreoStock() {
        oreoInStock.add(12);
        oreoInStock.add(8);
        oreoInStock.add(10);
        int totlOfOreoStock = 0;
        for (Integer quantity : oreoInStock) {
            totlOfOreoStock += quantity;
        }
        return totlOfOreoStock;
    }


    static List<DrinkItem> procduceOreo(Integer borioQuantity, Integer oreoQuantity) {
        System.out.println("quantity of borio before produce " + borioQuantity);
        System.out.println("oreoQuantity of borio before produce " + oreoQuantity);
        while (borioQuantity > 1 && oreoQuantity > 0) {
            borioQuantity = borioQuantity - 2;
            oreoQuantity = oreoQuantity - 1;
            DrinkItem item = new DrinkItem();
            itemList.add(item);
        }
        System.out.println("remain quantity of borio before produce " + borioQuantity);
        System.out.println("remain quantity of oreo before produce " + oreoQuantity);
        System.out.println(itemList.size());
        return itemList;
    }
}
