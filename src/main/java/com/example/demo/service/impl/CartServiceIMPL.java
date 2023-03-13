package com.example.demo.service.impl;
import com.example.demo.DTO.ItemInsertRequestDTO;
import com.example.demo.entity.Cart;
import com.example.demo.repo.CartRepo;
import com.example.demo.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceIMPL implements CartService {
    @Autowired
    private CartRepo cartRepo;
    public String addItem(ItemInsertRequestDTO itemInsertRequestDTO){
        //1 DTO--->Entity ,we should convert DTO into Entity
        //1 check exist of not
        if(!cartRepo.existsByProductName(itemInsertRequestDTO.getProductName())){
             //convert DTO entity
            Cart cart = new Cart(
                    itemInsertRequestDTO.getProductName(),
                    itemInsertRequestDTO.getQty(),
                    itemInsertRequestDTO.getUnitPrice()

            );
            cartRepo.save(cart);
            return "Data Saved";
        }
        return null;
    }
}
