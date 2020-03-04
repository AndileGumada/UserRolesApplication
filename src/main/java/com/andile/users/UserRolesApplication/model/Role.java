package com.andile.users.UserRolesApplication.model;

import javax.persistence.*;
import java.util.List;
@Entity
public class Role {
    @Id
    private String name;
    @ManyToMany(cascade = CascadeType.ALL)

    private List<User> users;

    public Role() {
    }

    public Role(String name, List<User> users) {
        this.name = name;
        this.users = users;
    }

    public Role(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}