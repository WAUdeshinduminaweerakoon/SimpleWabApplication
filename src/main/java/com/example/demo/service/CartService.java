package com.example.demo.service;

import com.example.demo.DTO.ItemInsertRequestDTO;

public interface CartService {
    static String addItem(ItemInsertRequestDTO itemInsertRequestDTO) {
        return null;
    }

    String addItem(ItemInsertRequestDTO itemInsertRequestDTO);
}
