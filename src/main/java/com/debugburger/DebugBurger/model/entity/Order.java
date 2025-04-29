package com.debugburger.DebugBurger.model.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_order", nullable = false)
    private Long idOrder;
    private List<Item> items = new ArrayList<>();

    private Status status;
    private Float totalValue;


    // TODO METODOS
    public Long getIdOrder() {
        return idOrder;
    }

    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        this.items.add(item);

    }

    public void deleteItem(Item item){

        for (Item i : items){

            if(i.getName().equals(item.getName())){
                items.remove(i);
            }
        }

    }
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Float getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Float totalValue) {
        this.totalValue = totalValue;
    }

    public void setIdOrder(Long idOrder) {
        this.idOrder = idOrder;
    }


    //TODO toString Order
    @Override
    public String toString() {
        return "Order{" +
                "idOrder=" + idOrder +
                ", items=" + items +
                ", status=" + status +
                ", totalValue=" + totalValue +
                '}';
    }
}
