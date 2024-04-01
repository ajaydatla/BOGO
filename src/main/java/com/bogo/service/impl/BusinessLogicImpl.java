package com.bogo.service.impl;

import com.bogo.Price;
import com.bogo.service.BusinessLogic;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class BusinessLogicImpl implements BusinessLogic {

    @Override
    public Price getPrice(Price prices) {
        Collections.sort(prices.getEachProductPrice(), Collections.reverseOrder());

        List<Integer> discountedItems = new ArrayList<>();
        List<Integer> payableItems = new ArrayList<>();

        int n = prices.getEachProductPrice().size();
        for (int i = 0; i < n; i++) {
            if (i + 1 < n && prices.getEachProductPrice().get(i + 1) != null) {
//                discountedItems.add(prices.getEachProductPrice().get(i));
                discountedItems.add(prices.getEachProductPrice().get(i + 1));
                payableItems.add(prices.getEachProductPrice().get(i));
                i++;
            } else {
                payableItems.add(prices.getEachProductPrice().get(i));
            }
        }
        System.out.println("Discounted Items = " + discountedItems);
        System.out.println("Payable Items = " + payableItems);

        prices.setDiscountedItems(discountedItems);
        prices.setPayableItems(payableItems);


        return prices;
    }
}
