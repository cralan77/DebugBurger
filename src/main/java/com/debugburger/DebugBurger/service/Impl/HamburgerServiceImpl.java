package com.debugburger.DebugBurger.service.Impl;

import com.debugburger.DebugBurger.model.entity.Category;
import com.debugburger.DebugBurger.model.entity.Hamburger;
import com.debugburger.DebugBurger.model.entity.Ingredient;
import com.debugburger.DebugBurger.model.repository.HamburgerRepository;
import com.debugburger.DebugBurger.service.ItemService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HamburgerServiceImpl implements ItemService {
    @Autowired
    HamburgerRepository hamburgerRepository;

    @Override
    public void insertItem(@NotNull Hamburger hamburger) {

        if(hamburger.getCategory()== Category.PRATO){
            hamburgerRepository.save(hamburger);
        }
        else{
            //TODO THROW
        }


    }

    @Override
    public void removeItem(@NotNull Hamburger hamburger) {
        if(hamburger.getCategory()== Category.PRATO){
            hamburgerRepository.delete(hamburger);
        }
        else{
            //TODO THROW
        }
    }

    @Override
    public List<Hamburger> viewAllItems() {
        return hamburgerRepository.findAll();

        //TODO THROW
    }

    public void additionalItem(@NotNull Hamburger hamburger, Ingredient ingredient){

        int count=0;
        for(Ingredient ing : hamburger.getIngredients()){

            if(ing.getCategory() == Category.ADICIONAL){
                count++;
            }
        }

        if(hamburger.getAdditionalItemQuantity() < count){
            hamburger.setIngredients(ingredient);
            hamburgerRepository.save(hamburger);
        }

        //
    }
}
