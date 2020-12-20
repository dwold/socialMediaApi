package com.dagnachew.socialMediaApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.dagnachew.socialMediaApi.entity.Comment;

public interface CommentRepository extends CrudRepository<Comment, Long> {

}
