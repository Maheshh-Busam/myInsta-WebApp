package com.myinsta.services;

import com.myinsta.exception.CommentException;
import com.myinsta.exception.PostException;
import com.myinsta.exception.UserException;
import com.myinsta.model.Comments;

public interface CommentService {
	
	public Comments createComment(Comments comment,Integer postId,Integer userId) throws PostException, UserException;

	public Comments findCommentById(Integer commentId) throws CommentException;
	public Comments likeComment(Integer CommentId,Integer userId) throws UserException, CommentException;
	public Comments unlikeComment(Integer CommentId,Integer userId) throws UserException, CommentException;
}
