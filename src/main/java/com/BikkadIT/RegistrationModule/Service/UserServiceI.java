package com.BikkadIT.RegistrationModule.Service;

import com.BikkadIT.RegistrationModule.Entites.User;

public interface UserServiceI {
	public User  getByUsername(String username);
	public User addCourse(User user);
}
