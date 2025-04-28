package com.debugburger.DebugBurger.service.Impl;

import com.debugburger.DebugBurger.model.entity.*;
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
    public void insertItem(@NotNull Item hamburger) {


        if(hamburger.getCategory()== Category.PRATO){
            hamburgerRepository.save((Hamburger) hamburger);
        }
        else{
            //TODO THROW
        }


    }

    @Override
    public void removeItem(@NotNull Item hamburger) {
        if(hamburger.getCategory()== Category.PRATO){
            hamburgerRepository.delete((Hamburger)hamburger);
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

    public void additionalItem(@NotNull Hamburger hamburger, AdditionalIngredient additionalIngredient){

        int count=0;
        for(Ingredient ing : hamburger.getIngredients()){

            if(ing.getCategory() == Category.ADICIONAL){
                count++;
            }
        }

        if(hamburger.getAdditionalItemQuantity() < count){
            hamburger.addAdditionalIngredient(additionalIngredient);
            hamburgerRepository.save(hamburger);
        }

        //
    }
}
