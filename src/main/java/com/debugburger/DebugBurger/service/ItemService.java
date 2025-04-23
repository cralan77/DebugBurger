package com.debugburger.DebugBurger.service;

import com.debugburger.DebugBurger.model.entity.Hamburger;


import java.util.List;

public interface ItemService<Obj extends Hamburger, Ingredient, Product> {

    void insertItem(Obj item);

    void removeItem(Obj item);

    List<Obj> viewAllItems();

   // List<Item> viewItemsByCategory(Category category);
}
