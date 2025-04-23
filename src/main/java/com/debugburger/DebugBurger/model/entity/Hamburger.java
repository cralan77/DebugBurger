package com.debugburger.DebugBurger.model.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Hamburger extends Item{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_hamburger", nullable = false)
    private Long idHamburger;


    private List<Ingredient> ingredients = new ArrayList<>();


    private int additionalItemQuantity;

    public void setIngredients(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public int getAdditionalItemQuantity() {
        return additionalItemQuantity;
    }

    public void setAdditionalItemQuantity(int additionalItemQuantity) {
        this.additionalItemQuantity = additionalItemQuantity;
    }

    public Long getIdHamburger() {
        return idHamburger;
    }

    public void setIdHamburger(Long idHamburger) {
        this.idHamburger = idHamburger;

    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    private int momentaryQuantityAdditional (){
        int momentaryQuantityAdditional=0;
        for(Ingredient i: this.ingredients){
            if(i.getCategory().equals(Category.ADICIONAL)){
                momentaryQuantityAdditional++;
            }
        }

        return momentaryQuantityAdditional;
    }

    public void addIngredient(Ingredient ingredient) {

        if(momentaryQuantityAdditional() < additionalItemQuantity){
            this.ingredients.add(ingredient);
            super.value += ingredient.getValue();
        }else{
            // TODO: throw BUSINESS EXCEPTION
        }



    }

    public void removeIngredient(Ingredient ingredient){

        this.ingredients.removeIf(i -> i.getName().equals(ingredient.getName()));
        super.value -= ingredient.getValue();

    }

    private String ItemsforString(){
        String ingredients="";
        for(Ingredient i : this.ingredients){
            ingredients = ingredients + i.getName()+ " - "+i.getValue()+" - "+i.getCategory()+"\n";
        }

        //TODO throw BUSINESS EXCEPTION INGREDIENTS VAZIO

        return ingredients;
    }
    public String totalValue(){

        return "Valor total: "+ super.getValue()+"\n"+
                "Lanche: "+ super.getName()+"\n"+
                "Itens: "+ItemsforString();

    }

}
