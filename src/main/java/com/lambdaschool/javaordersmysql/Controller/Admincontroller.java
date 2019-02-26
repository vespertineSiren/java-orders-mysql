package com.lambdaschool.javaordersmysql.Controller;

import com.lambdaschool.javaordersmysql.Repository.Agentrepository;
import com.lambdaschool.javaordersmysql.Repository.Customerrepository;
import com.lambdaschool.javaordersmysql.Repository.Orderrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/admin", produces = MediaType.APPLICATION_JSON_VALUE)
public class Admincontroller {

    //puts, posts, and deletes
    @Autowired
    Agentrepository agentrepository;

    @Autowired
    Orderrepository orderrepository;

    @Autowired
    Customerrepository customerrepository;

}
