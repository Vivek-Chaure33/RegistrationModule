package com.BikkadIT.RegistrationModule.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.RegistrationModule.Entites.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	public User  findByUsername(String username);
}
