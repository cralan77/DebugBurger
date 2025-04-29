package com.debugburger.DebugBurger.service.Impl;

import com.debugburger.DebugBurger.model.entity.Category;
import com.debugburger.DebugBurger.model.entity.Item;
import com.debugburger.DebugBurger.model.entity.Menu;
import com.debugburger.DebugBurger.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    Menu menu;

    @Override
    public void insertItemMenu(Item item) {
        menu.insertItems(item);
    }

    @Override
    public void removeItemMenu(Item item) {
        menu.removeItem(item);
    }

    @Override
    public Menu viewMenu(Category... category) {
        return menu;
    }
}
