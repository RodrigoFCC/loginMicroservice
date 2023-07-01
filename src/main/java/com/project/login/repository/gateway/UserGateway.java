package com.project.login.repository.gateway;

import com.project.login.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserGateway extends JpaRepository<User, Long> {

}
