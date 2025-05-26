package com.uep.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uep.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer>{

}
