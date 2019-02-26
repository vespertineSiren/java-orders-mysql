package com.lambdaschool.javaordersmysql.Repository;

import com.lambdaschool.javaordersmysql.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Orderrepository extends JpaRepository<Order, Long> {
}
