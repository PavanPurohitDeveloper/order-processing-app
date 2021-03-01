package com.nit.service.impl;

import com.nit.entity.Order;
import com.nit.repository.OrderRepository;
import com.nit.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void createOrder(Order order) {
        orderRepository.save(order);
    }

    @Override
    public void updateOrder(int ordNum, Order order) {
        //orderRepository.save(order);
    }

    @Override
    public List<Order> getAllOrders() {
        return (List<Order>) orderRepository.findAll();
    }

    @Override
    public Order getOrder(int ordNum) {
        //return topicRespository.findById(orderId).orElse(new Order());
        return null;
    }

    @Override
    public void deleteOrder(String ordNum) {
        //topicRespository.deleteById(orderId);
    }
}
