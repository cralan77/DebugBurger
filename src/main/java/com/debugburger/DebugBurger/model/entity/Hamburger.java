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

    private List<AdditionalIngredient> additionalIngredients = new ArrayList<>();

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

    public List<AdditionalIngredient> getAdditionalIngredients() {
        return additionalIngredients;
    }



    private int momentaryQuantityAdditional (){
        int momentaryQuantityAdditional=0;
        for(AdditionalIngredient i: this.additionalIngredients){
            if(i.getCategory().equals(Category.ADICIONAL)){
                momentaryQuantityAdditional++;
            }
        }

        return momentaryQuantityAdditional;
    }

    public void addAdditionalIngredient(AdditionalIngredient additionalIngredient) {

        if(momentaryQuantityAdditional() < additionalItemQuantity){
            this.additionalIngredients.add(additionalIngredient);
            super.value += additionalIngredient.getValue();
        }else{
            // TODO: throw BUSINESS EXCEPTION
        }



    }

    public void removeAdditionalIngredient(AdditionalIngredient additionalIngredient){

        this.additionalIngredients.removeIf(i -> i.getName().equals(additionalIngredient.getName()));
        super.value -= additionalIngredient.getValue();

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
