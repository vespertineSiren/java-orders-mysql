package com.lambdaschool.javaordersmysql.Controller;

import com.lambdaschool.javaordersmysql.Model.Customer;
import com.lambdaschool.javaordersmysql.Repository.Customerrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="/customers", produces = MediaType.APPLICATION_JSON_VALUE)
public class Customercontroller {

    @Autowired
    Customerrepository customerrepository;

    @GetMapping("/customers")
    public List<Customer> listAllCustomers(){
        return customerrepository.findAll();
    }

    @GetMapping("/custcode/{custcode}")
    public Customer getCustomerbyCustomerCode(@PathVariable long custcode){
        return customerrepository.findById(custcode).get();
    }

}
