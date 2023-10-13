package com.jpah2.test.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpah2.test.dao.UserRepository;
import com.jpah2.test.entity.User1;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public User1 createUser(User1 user) {
		return userRepository.save(user);
	}

	public List<User1> createUsers(List<User1> users) {
		return userRepository.saveAll(users);
	}

	public User1 getUserById(int id) {
		return userRepository.findById(id).orElse(null);
	}

	public List<User1> getUsers() {
		return userRepository.findAll();
	}
	
	public User1 updateUser(User1 user) {
		User1 oldUser=null;
		Optional<User1> optionaluser=userRepository.findById(user.getId());
		if(optionaluser.isPresent()) {
			oldUser=optionaluser.get();
			oldUser.setName(user.getName());
			oldUser.setAddress(user.getAddress());
			userRepository.save(oldUser);
		}else {
			return new User1();
		}
		return oldUser;
	}
	
	public String deleteUserById(int id) {
		userRepository.deleteById(id);
		return "User got deleted";
	}

}
