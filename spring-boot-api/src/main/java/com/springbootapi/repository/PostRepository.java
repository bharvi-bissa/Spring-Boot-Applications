package com.springbootapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.springbootapi.model.Post;

public interface PostRepository extends CrudRepository<Post, Integer> {

	
}
