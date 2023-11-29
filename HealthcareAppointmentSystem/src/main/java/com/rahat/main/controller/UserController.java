package com.rahat.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rahat.main.modal.User;
import com.rahat.main.repository.UserRepository;

@RestController
@RequestMapping("/api/user")
public class UserController {
	@Autowired
	private UserRepository userRepo;
	
	@PostMapping("/add")
	public User addUser(@RequestBody User user) {
		return userRepo.save(user);
	}
	
	@GetMapping("/all")
	public List<User> getAllUser() {
		return userRepo.findAll();
	}
	
	@PatchMapping("/update")
	public User updateUser(@RequestBody User user) {
		return userRepo.save(user);
	}
	
	@DeleteMapping("/delete/{uid}")
	public String deleteUser(@PathVariable("uid") Long id) {
		try {
			userRepo.deleteById(id);
		} catch (Exception e) {
			return "Failed to delete";
		}
		
		return "Successfully delete";
	}
}
