package com.BikkadIT.RegistrationModule.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.RegistrationModule.Dao.UserRepository;
import com.BikkadIT.RegistrationModule.Entites.User;
@Service
public class UserServiceImpl implements UserServiceI{
	@Autowired
	UserRepository repository;
	
	@Override
	public User getByUsername(String username) {
		User findByUsername = repository.findByUsername(username);
		return findByUsername;
	}

	@Override
	public User addCourse(User user) {
		User save = repository.save(user);
		return save;
	}

}
