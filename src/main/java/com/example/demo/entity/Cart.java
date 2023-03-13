package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name="Cart")

public class Cart {
    @Id
    @Column(name="Cart_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cartId;
    @Column(name="Product_Name",unique = true)
    private String productName;
    @Column(name="qty",nullable = false)
    private int qty;
    @Column(name="Unit_Price",nullable = false)
    private float unitPrice;


}
