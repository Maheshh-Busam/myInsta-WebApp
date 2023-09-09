package com.myinsta.services;

import java.util.List;

import com.myinsta.exception.StoryException;
import com.myinsta.exception.UserException;
import com.myinsta.model.Story;

public interface StoryService {

	public Story createStory(Story story,Integer userId) throws UserException;
	
	public List<Story> findStoryByUserId(Integer userId) throws UserException, StoryException;
	
	
}
