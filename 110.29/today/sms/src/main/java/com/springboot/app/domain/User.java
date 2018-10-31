package com.springboot.app.domain;

import lombok.Data;

@Data
public class User {
    private String name;
    private String price;
    private String type;
    private String testval;
    public String getVal(){
        return type+price;
    }
}
