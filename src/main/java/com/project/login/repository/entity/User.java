package com.project.login.repository.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.security.core.userdetails.UserDetails;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Builder
@Table(name = "Login")
public class User {


    @Id
    @GeneratedValue
    private long id_user;

    private String name;

    private String email;

    private String password;


}
