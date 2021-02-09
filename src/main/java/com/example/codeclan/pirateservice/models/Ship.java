package com.example.codeclan.pirateservice.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ships") // create table 'ships'
public class Ship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // want the db to generate the id
    private Long id;

    @Column // no need to annotate further, the column will be called 'name
    private String name;

    @OneToMany(mappedBy = "ship") // the foreign key will be 'ship'
    private List<Pirate> pirates;

    public Ship(String name) {
        this.name = name;
        this.pirates = new ArrayList<>();
    }

    // Default/empty constructor for Spring to use...
    public Ship(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pirate> getPirates() {
        return pirates;
    }

    public void setPirates(List<Pirate> pirates) {
        this.pirates = pirates;
    }

}
