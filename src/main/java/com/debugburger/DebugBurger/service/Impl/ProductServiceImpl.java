package com.debugburger.DebugBurger.service.Impl;

import com.debugburger.DebugBurger.model.entity.Category;
import com.debugburger.DebugBurger.model.entity.Hamburger;
import com.debugburger.DebugBurger.model.entity.Item;
import com.debugburger.DebugBurger.model.entity.Product;
import com.debugburger.DebugBurger.model.repository.ProductRepository;
import com.debugburger.DebugBurger.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductServiceImpl implements ItemService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public void insertItem(Item item) {

        if(item.getCategory() == Category.PRODUTO){
            productRepository.save((Product) item);
        }else{

            //TODO THROW
        }

    }
    @Override
    public void removeItem(Item item) {

        if(item.getCategory()==Category.PRODUTO){
            productRepository.delete((Product) item );
        }
    }

    @Override
    public List viewAllItems() {

        return productRepository.findAll();

    }
}
