package com.debugburger.DebugBurger.service;

import com.debugburger.DebugBurger.model.entity.Category;
import com.debugburger.DebugBurger.model.entity.Item;
import com.debugburger.DebugBurger.model.entity.Menu;

public interface MenuService {

     void insertItemMenu(Item item);

     void removeItemMenu(Item item);

     Menu viewMenu(Category... category);


}
