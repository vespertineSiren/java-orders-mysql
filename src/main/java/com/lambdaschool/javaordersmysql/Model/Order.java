package com.lambdaschool.javaordersmysql.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ordnum;

    private double ordamount, advanceamount;
    private String orddescription;

    @ManyToOne
    @JoinColumn(name ="agentcode")
    private Agent agent;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "orders")
    private Set<Customer> customers;

    public Order() {
    }

    public long getOrdnum() {
        return ordnum;
    }

    public void setOrdnum(long ordnum) {
        this.ordnum = ordnum;
    }

    public double getOrdamount() {
        return ordamount;
    }

    public void setOrdamount(double ordamount) {
        this.ordamount = ordamount;
    }

    public double getAdvanceamount() {
        return advanceamount;
    }

    public void setAdvanceamount(double advanceamount) {
        this.advanceamount = advanceamount;
    }

    public String getOrddescription() {
        return orddescription;
    }

    public void setOrddescription(String orddescription) {
        this.orddescription = orddescription;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public Set<Customer> getCustomers() {
        return customers;
    }
    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }
}
