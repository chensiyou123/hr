package com.csy.hr.domain;

import javax.persistence.*;

@Table(name = "vhr.politicsstatus")
public class Politicsstatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public Politicsstatus(String name) {
        this.name = name;
    }
    public Politicsstatus(){}
}