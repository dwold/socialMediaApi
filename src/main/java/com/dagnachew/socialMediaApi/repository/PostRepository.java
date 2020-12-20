package com.dagnachew.socialMediaApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.dagnachew.socialMediaApi.entity.Post;

public interface PostRepository extends CrudRepository<Post, Long> {

}
