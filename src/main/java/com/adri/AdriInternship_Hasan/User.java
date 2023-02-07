package com.adri.AdriInternship_Hasan;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;
  
    @Column(name = "user_name")
    private String userName;
  
    @Column(name = "email")
    private String email;
  
    @Column(name = "information")
    private String information;
  
    //getters and setters
    public Long getId() {
        return id;
    }
  
    public void setId(Long id) {
        this.id = id;
    }
  
    public String getUserName() {
        return userName;
    }
  
    public void setUserName(String userName) {
        this.userName = userName;
    }
  
    public String getEmail() {
        return email;
    }
  
    public void setEmail(String email) {
        this.email = email;
    }
  
    public String getInformation() {
        return information;
    }
  
    public void setInformation(String information) {
        this.information = information;
    }
}

