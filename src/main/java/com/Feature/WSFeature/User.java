package com.Feature.WSFeature;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity

public class User {

    @Id
    @GeneratedValue
    private int id;

    @NotBlank
    private  String name;

    public User(){

    }

    public User(int id, @NotBlank String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Customer[id=%d, name='%s']", id, name);
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
