package com.bogo;

import java.util.List;

public class Price {
    private List<Integer> eachProductPrice;

    private List<Integer> discountedItems;

    private List<Integer> payableItems;

    public List<Integer> getEachProductPrice() {
        return eachProductPrice;
    }

    public void setEachProductPrice(List<Integer> eachProductPrice) {
        this.eachProductPrice = eachProductPrice;
    }

    public List<Integer> getDiscountedItems() {
        return discountedItems;
    }

    public void setDiscountedItems(List<Integer> discountedItems) {
        this.discountedItems = discountedItems;
    }

    public List<Integer> getPayableItems() {
        return payableItems;
    }

    public void setPayableItems(List<Integer> payableItems) {
        this.payableItems = payableItems;
    }
}