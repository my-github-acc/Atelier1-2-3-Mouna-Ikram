package com.tp.jwt.services;

import java.util.List;

import com.tp.jwt.entities.Role;
import com.tp.jwt.entities.User;

public interface UserService {
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
	List<User> findAllUsers();
}