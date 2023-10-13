package com.jpah2.test.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpah2.test.Services.UserService;
import com.jpah2.test.entity.User1;

@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping("/addUser")
	public User1 addUser(@RequestBody User1 user) {
		return userService.createUser(user);
	}

	@PostMapping("/addUsers")
	public List<User1> addUsers(@RequestBody List<User1> users) {
		return userService.createUsers(users);
	}

	@GetMapping("/user/{id}")
	public User1 getUserById(@PathVariable int id) {
		return userService.getUserById(id);
	}

	@GetMapping("/users")
	public List<User1> getAllUsers() {
		return userService.getUsers();
	}
	
	@PutMapping("/updateuser")
	public User1 updateUser(@RequestBody User1 user) {
		return userService.updateUser(user);
	}

	@DeleteMapping("/user/{id}")
	public String deleteUser(@PathVariable int id) {
		return userService.deleteUserById(id);
	}
}


