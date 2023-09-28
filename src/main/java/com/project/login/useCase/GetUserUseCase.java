package com.project.login.useCase;

//import com.project.login.repository.UserRepository;
import com.project.login.controller.request.UserRequest;
import com.project.login.models.UserModel;
import com.project.login.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@AllArgsConstructor
@Service
public class GetUserUseCase {

    private UserRepository repository;

    public UserModel saveUser(UserRequest userRequest){
        if(Objects.isNull(userRequest)){
            ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        var userModel = new UserModel();

        BeanUtils.copyProperties(userRequest, userModel);

        var saveResult = repository.save(userModel);

        return saveResult;
    }

    public List<UserModel> getAllUsers() {
        return repository.findAll();
    }





}
