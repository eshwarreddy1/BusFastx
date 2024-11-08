package com.hexaware.busfastx.service;

import java.util.List;

import com.hexaware.busfastx.entity.User;

public interface IUserService {
	int createUser(User User);
	int deleteUser(User User);
	int updateUser(User User);
	List<User> getAllUser();
	List<User> getByUserId(int userId);
	

}
