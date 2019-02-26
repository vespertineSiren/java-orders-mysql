package com.lambdaschool.javaordersmysql.Repository;

import com.lambdaschool.javaordersmysql.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Customerrepository extends JpaRepository<Customer, Long> {
}
