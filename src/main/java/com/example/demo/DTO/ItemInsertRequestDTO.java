package com.example.demo.DTO;

import javax.persistence.Column;

public class ItemInsertRequestDTO {
    private String productName;
    private int qty;
    private float unitPrice;

    public ItemInsertRequestDTO(String productName, int qty, float unitPrice) {
        this.productName = productName;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }
}
