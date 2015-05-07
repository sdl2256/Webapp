package com.sundl.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Set;

/**
 * Created by Sun on 2015/5/7.
 */
@Entity
@Table(name = "department")
public class Department {
    private int id;
    private String name;
    private Set<Employee> sets;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    public Set<Employee> getSets() {
        return sets;
    }

    public void setSets(Set<Employee> sets) {
        this.sets = sets;
    }

}
