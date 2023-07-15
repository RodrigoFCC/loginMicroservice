package com.project.login.controller;


import com.project.login.controller.request.GetUserRequest;
import com.project.login.controller.request.UserRequest;
import com.project.login.models.UserModel;
import com.project.login.repository.UserRepository;
import com.project.login.useCase.GetUserUseCase;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

	@Autowired
	private final GetUserUseCase useCase;

	@PostMapping
	public ResponseEntity createUser(@RequestBody @Valid UserRequest request) {

		var saveResult = useCase.saveUser(request);

		return ResponseEntity.status(HttpStatus.CREATED).body(saveResult);
	}

	@GetMapping
	public ResponseEntity getAllUsers() {

		var saveResult = useCase.getAllUsers();

		return ResponseEntity.status(HttpStatus.OK).body(saveResult);
	}
}
