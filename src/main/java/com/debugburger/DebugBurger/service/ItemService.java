package com.debugburger.DebugBurger.service;

import com.debugburger.DebugBurger.model.entity.Item;

import java.util.List;

public interface ItemService<Obj extends Item> {

    void insertItem(Obj item);

    void removeItem(Obj item);

    List<Obj> viewAllItems();

   // List<Item> viewItemsByCategory(Category category);
}
