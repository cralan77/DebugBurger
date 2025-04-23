package com.debugburger.DebugBurger.service;

import com.debugburger.DebugBurger.model.entity.Item;
import com.debugburger.DebugBurger.model.entity.Order;
import com.debugburger.DebugBurger.model.entity.Status;

import java.util.List;

public interface OrderService {

    Order initOrder();

    Order insertItem(Long id, Item item);

    Order deleteItem(Long id, Item item);

    Order viewOrder(Order order);

    Order finishOrder(Long id);

    List<Order> viewAllOrders();

    List<Order> viewByStatus(Status status);

    Order findByID(Long id);

}
