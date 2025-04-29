package com.debugburger.DebugBurger.service.Impl;

import com.debugburger.DebugBurger.model.entity.Item;
import com.debugburger.DebugBurger.model.entity.Order;
import com.debugburger.DebugBurger.model.entity.Status;
import com.debugburger.DebugBurger.model.repository.OrderRepository;
import com.debugburger.DebugBurger.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Override
    public Order initOrder(Order order) {

        return orderRepository.save(order);
    }

    @Override
    public Order insertItem(Order order, Item item) {
        order.addItem(item);

        return orderRepository.save(order);
    }

    @Override
    public Order deleteItem(Order order, Item item) {
        order.deleteItem(item);

        return orderRepository.save(order);
    }

    @Override
    public String viewOrder(Order order) {
        return order.toString();
    }

    @Override
    public Order finishOrder(Order order) {
        return null;
    }

    @Override
    public List<Order> viewAllOrders() {
        return null;
    }

    @Override
    public List<Order> viewByStatus(Status status) {
        return null;
    }

    @Override
    public Order findByID(Long id) {
        return null;
    }


}
