package com.example.springboot.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.Model.User;
import com.example.springboot.Repo.UserRepo;
@Service 
public class UserService {
	@Autowired
	UserRepo repo;

	public void saveOrUpdate(User user)   
	{  
		repo.save(user);
	
	}  
	
	public User getUserById(int uid)   
	{  
	return repo.findById(uid).get();
	
	}  
	
}
