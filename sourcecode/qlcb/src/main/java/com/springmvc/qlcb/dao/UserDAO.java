package com.springmvc.qlcb.dao;

import java.util.List;

import com.springmvc.qlcb.model.User;

public interface UserDAO {
	void addUser(User user);

	void editUser(User user);

	void deleteUser(int userId);

	User findUser(int userId);

	User findUserByName(String username);

	List<User> getAllUsers();
}
