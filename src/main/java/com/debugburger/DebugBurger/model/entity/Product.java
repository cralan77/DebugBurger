package com.debugburger.DebugBurger.model.entity;

import jakarta.persistence.*;

@Entity
public class Product extends Item{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_product", nullable = false)
    private Long idProduct;

    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

}
