package com.example.springsecurity.model;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Entity
@Table(name = "role")
public class Role implements GrantedAuthority {
//
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private int Id;
    @Column(name = "role_name")
    private String role;


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String getAuthority() {
        return role;
    }

}
