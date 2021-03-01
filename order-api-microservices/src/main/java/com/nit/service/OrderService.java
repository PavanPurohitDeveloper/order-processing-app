package com.nit.service;

import com.nit.entity.Order;
import java.util.List;

public interface OrderService {

    //create a new Order
    void createOrder(Order order);

    //Update the Order based on the Order Id
    void updateOrder(int ordNum, Order order);

    //Get All the Orders
    List<Order> getAllOrders();

    //Get Order details
    Order getOrder(int ordNum);

    //Delete the Order
    void deleteOrder(String ordNum);

}
