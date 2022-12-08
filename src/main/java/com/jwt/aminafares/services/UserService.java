package com.jwt.aminafares.services;

import java.util.List;

import com.jwt.aminafares.entities.Role;
import com.jwt.aminafares.entities.User;

public interface UserService {
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
	List<User> findAllUsers();
}