package com.lambdaschool.javaordersmysql.Repository;

import com.lambdaschool.javaordersmysql.Model.Agent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Agentrepository extends JpaRepository<Agent, Long> {
}
