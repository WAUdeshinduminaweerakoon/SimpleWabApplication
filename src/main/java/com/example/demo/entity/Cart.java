package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name="Cart")

public class Cart {
    @Id
    @Column(name="Cart_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cartId;
    @Column(name="Product_Name",nullable = false)
    private String productName;
    @Column(name="qty",nullable = false)
    private int qty;
    @Column(name="Unit_Price",nullable = false)
    private float unitPrice;

    public Cart(int cartId, String productName, int qty, float unitPrice) {
        this.cartId = cartId;
        this.productName = productName;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public Cart() {

    }

    public Cart(String productName, int qty, float unitPrice) {
    }


    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
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
