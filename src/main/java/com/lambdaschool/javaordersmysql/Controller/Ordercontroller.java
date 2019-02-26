package com.lambdaschool.javaordersmysql.Controller;

import com.lambdaschool.javaordersmysql.Model.Order;
import com.lambdaschool.javaordersmysql.Repository.Orderrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="/orders", produces = MediaType.APPLICATION_JSON_VALUE)
public class Ordercontroller {

    @Autowired
    Orderrepository orderrepository;

    @GetMapping("/orders")
    public List<Order> listAllOrders(){
        return orderrepository.findAll();
    }

    @GetMapping("/ordnum/{ordnum}")
    public Order findOrderbyOrderNumber(@PathVariable long ordnum){
        return orderrepository.findById(ordnum).get();
    }
}
