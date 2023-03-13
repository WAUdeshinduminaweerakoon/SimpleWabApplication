package com.example.demo.controller;

import com.example.demo.DTO.ItemInsertRequestDTO;
import com.example.demo.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(path =  "api/v1/cart")

public class CartController {
    @Autowired
    private CartService cartService;

    @PostMapping(path = "/insert")
    public String insertData(@RequestBody ItemInsertRequestDTO itemInsertRequestDTO){
        String message = cartService.addItem(itemInsertRequestDTO);
        return message;
    }



}