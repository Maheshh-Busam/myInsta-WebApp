package com.myinsta.services;

import java.util.List;
import java.util.Optional;

import com.myinsta.dto.UserDto;
import com.myinsta.exception.PostException;
import com.myinsta.exception.UserException;
import com.myinsta.model.Post;
import com.myinsta.model.User;

public interface UserService {
	
	public User registerUser(User user) throws UserException;
	
	public User findUserById(Integer userId) throws UserException;
	
	public User findUserProfile(String token) throws UserException;
	
	public User findUserByUsername(String username) throws UserException;
	
	public String followUser(Integer reqUserId,Integer followUserId) throws UserException;
	
	public String unfollowUser(Integer reqUserId, Integer unfollowUserId) throws UserException; 
	
	public List<User> findUsersByUserIds(List<Integer> userIds);
	
	public List<User> searchUser(String query) throws UserException;
	
	

	public User updateUserDetails(User updatedUser, User existingUser) throws UserException;
	
	
}
