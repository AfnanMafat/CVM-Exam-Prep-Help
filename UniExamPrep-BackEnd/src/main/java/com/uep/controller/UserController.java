package com.uep.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.uep.model.User;
import com.uep.service.UserService;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
class UserController{
	
	@Autowired
	UserService userService;
	
	// Add New User
	@PostMapping("/AddUser")
	public void AddUser(@RequestBody User user) {
		userService.AddUser(user);
	}
	
	@GetMapping("/FindUser/{id}")
	public Optional<User> FindUser(@PathVariable Integer id) {
		return userService.FindUser(id);
	}
	
	@GetMapping("/FindUserEmail/{email}")
	public User FindUserEmail(@PathVariable String email) {
		return userService.FindUserEmail(email);
	}
	
	@PutMapping("/UpdateUser/{id}")
	public void UpdateUser(@RequestBody User user,@PathVariable Integer id) {
		
		User UpdateUser = new User();
		if(FindUser(id) != null) {
			UpdateUser.setId(id);
			UpdateUser.setName(user.getName());
			UpdateUser.setEmail(user.getEmail());
			UpdateUser.setPassword(user.getPassword());
		}
		
		userService.AddUser(UpdateUser);
	}
	
	@DeleteMapping("/DeleteUser/{id}")
	public void DeleteUser(@PathVariable Integer id) {
		
		if(FindUser(id)!= null) {
			userService.DeleteUser(id);
		}
	}
}