package com.springbootapi.service;

import java.util.List;
import java.util.Optional;

import com.springbootapi.model.Post;

public interface PostService {

	public List<Post> getAllPosts();

	public Optional<Post> getPost(int id);

	public List<Post> updatePost(int id,Post post);

	public List<Post> createPost(Post post);
	
	public void deletePost(int id);
}
