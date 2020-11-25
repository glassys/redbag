package com.neusoft.redbag;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue

    private String id;
    private String username;
    private String password;
    private String email;

}
