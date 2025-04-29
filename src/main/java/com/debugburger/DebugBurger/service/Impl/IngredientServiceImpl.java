package com.debugburger.DebugBurger.service.Impl;

import com.debugburger.DebugBurger.model.entity.Category;
import com.debugburger.DebugBurger.model.entity.Ingredient;
import com.debugburger.DebugBurger.model.entity.Item;
import com.debugburger.DebugBurger.model.repository.IngredientRepository;
import com.debugburger.DebugBurger.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientServiceImpl implements ItemService {

    @Autowired
    IngredientRepository ingredientRepository;

    @Override
    public void insertItem(Item item) {

        if(item.getCategory() == Category.INGREDIENTE){
            ingredientRepository.save((Ingredient) item);
        }else{
            //TODO THROW
        }
    }

    @Override
    public void removeItem(Item item) {
        if(item.getCategory() == Category.INGREDIENTE){
            ingredientRepository.delete((Ingredient) item);
        }else{
            //TODO THROW
        }

    }

    @Override
    public List viewAllItems() {
        return ingredientRepository.findAll();
    }
}
