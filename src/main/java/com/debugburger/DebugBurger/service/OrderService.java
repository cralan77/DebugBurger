package com.debugburger.DebugBurger.service;

import com.debugburger.DebugBurger.model.entity.Item;
import com.debugburger.DebugBurger.model.entity.Order;
import com.debugburger.DebugBurger.model.entity.Status;

import java.util.List;

public interface OrderService {

    Order initOrder(Order order);

    Order insertItem(Order order, Item item);

    Order deleteItem(Order order, Item item);

    String viewOrder(Order order);

    Order finishOrder(Order order);

    List<Order> viewAllOrders();

    List<Order> viewByStatus(Status status);

    Order findByID(Long id);

}
