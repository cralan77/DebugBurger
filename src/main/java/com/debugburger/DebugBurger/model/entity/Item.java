package com.debugburger.DebugBurger.model.entity;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Item {
    protected String name;
    protected float value;
    protected Category category;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }




}
