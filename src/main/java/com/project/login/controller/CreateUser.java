package com.project.login.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class CreateUser {
	@GetMapping
	public ResponseEntity getUser(@RequestParam String email, @RequestParam String password) {


		return ResponseEntity.ok(".");
	}
}
