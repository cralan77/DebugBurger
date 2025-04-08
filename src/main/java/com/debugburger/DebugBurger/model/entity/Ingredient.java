package com.debugburger.DebugBurger.model.entity;

import jakarta.persistence.*;

@Entity
public class Ingredient extends Item{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_ingredient", nullable = false)
    private Long idIngredient;

    public Long getIdIngredient() {
        return idIngredient;
    }

    public void setIdIngredient(Long idIngredient) {
        this.idIngredient = idIngredient;
    }
}
