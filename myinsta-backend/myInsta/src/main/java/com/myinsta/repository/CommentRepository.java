package com.myinsta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.myinsta.model.Comments;


public interface CommentRepository extends JpaRepository<Comments, Integer> {

}
