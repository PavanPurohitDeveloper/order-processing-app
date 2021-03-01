package com.nit.controller;

import com.nit.entity.Order;
import com.nit.service.OrderService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping("/api/v1")
@RestController
@Api(value = "Order Resource to handle all the order related action and queries")
public class OrdersController {

    @Autowired
    private OrderService orderService;

    /**
     * If you want to create a new resource (Ex: Order) , you have to make a POST request..
     * get the POST body, converted into Order instance, and add that to the List  in the TopicService..
     * pick this instance from the @RequestBody
     * @RequestBody -- tells spring MVC that, your request failover will contain JSON representation of
     * this Order instance and you are asking to take that RequestBody and converted into a Order Instance..
     */
    @RequestMapping(value = "/orders", method = RequestMethod.POST)
    public void createOrder(@RequestBody Order order){
        log.debug("Creating a Order: {}", order);
        orderService.createOrder(order);
    }

    @RequestMapping(value = "/orders", method = RequestMethod.GET)
    public List<Order> getAllOrders(){
        log.debug("Retrieving all the Orders from database..");
        return orderService.getAllOrders();
    }

    @RequestMapping(value = "/orders/{ordId}", method = RequestMethod.GET)
    public Order getOrder(@PathVariable int ordId){
        log.debug("Retrieving the Order from database for orderId: {}", ordId);
        return orderService.getOrder(ordId);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/orders/{ordId}")
    public void updateOrder(@RequestBody Order order, @PathVariable int ordId){
        log.debug("Updating the order for orderId: {}", ordId );
        orderService.updateOrder(ordId, order);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/orders/{ordId}")
    public void deleteOrder(@PathVariable String ordId){
        log.debug("Deleting the order for orderId: {}", ordId );
        orderService.deleteOrder(ordId);
    }
}
