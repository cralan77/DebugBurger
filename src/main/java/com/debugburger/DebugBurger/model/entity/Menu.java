package com.debugburger.DebugBurger.model.entity;


import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<Item> items = new ArrayList<>();

    public List<Item> getItems() {
        //TODO PARAMETRO OPCIONAL
        return items;
    }

    public void insertItems(Item item){

        items.add(item);
    }

    public void removeItem(Item item){

        for(Item i: items){
            if(i.getName().equals(item.getName())){
                items.remove(i);
            }

        }
    }

}
