package com.java.exampleSharding.entity.jpa;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user_info")
public class UserInfo {
    @Id
    private Long userId;
    
    private String name;
    
    private String age;
    
    public Long getUserId() {
        return userId;
    }
    
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getAge() {
        return age;
    }
    
    public void setAge(String age) {
        this.age = age;
    }
}