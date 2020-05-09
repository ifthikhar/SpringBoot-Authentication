package com.resourceauthenication.springboot.web.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Entity
public class Employee {
    @Id
    private Integer id;
    @NotNull(message = "name should not be empty")
    private String name;
    @NotNull
    @Email(message = "Not a valid email address")
    private String email;


    Employee()
    {
    super();
    }

    Employee(Integer id, String name, String email)
    {

        this.id = id;
        this.name = name;
        this.email= email;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
