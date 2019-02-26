package com.lambdaschool.javaordersmysql.Controller;

import com.lambdaschool.javaordersmysql.Model.Agent;
import com.lambdaschool.javaordersmysql.Repository.Agentrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="/agents", produces = MediaType.APPLICATION_JSON_VALUE)
public class Agentcontroller {

    @Autowired
    Agentrepository agentrepository;

    @GetMapping("/agents")
    public List<Agent> listAllAgents(){
        return agentrepository.findAll();
    }

    @GetMapping("/agentcode/{agentcode")
    public Agent findAgentbyAgentCode(@PathVariable long agentcode) {
        return agentrepository.findById(agentcode).get();
    }

}
