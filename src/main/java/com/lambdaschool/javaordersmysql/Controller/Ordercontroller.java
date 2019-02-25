package com.lambdaschool.javaordersmysql.Controller;

import com.lambdaschool.javaordersmysql.Repository.Orderrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/orders", produces = MediaType.APPLICATION_JSON_VALUE)
public class Ordercontroller {

    @Autowired
    Orderrepository orderrepository;
}
