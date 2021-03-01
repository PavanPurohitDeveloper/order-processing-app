package com.nit.repository;

import com.nit.entity.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//perform the CRUD operations
@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {

    //getAllOrders()
    //getOrder(String id)
    //updateOrder(Topic t)
    //deleteOrder(String id)
}
