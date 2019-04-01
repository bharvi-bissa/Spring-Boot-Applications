package com.springbootapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootapi.model.Post;
import com.springbootapi.service.PostServiceImpl;

@RestController
public class PostController {

	@Autowired
	PostServiceImpl postService;

	// get all Posts
	@GetMapping("/posts")
	public List<Post> getPosts() {

		return postService.getAllPosts();

	}

	// get single Post
	@GetMapping("/posts/{id}")
	public Optional<Post> getPost(@PathVariable int id) {
		return postService.getPost(id);
	}

	// create new Post
	@PostMapping("/posts")
	public List<Post> createPost(@RequestBody Post post) {
		return postService.createPost(post);
	}

	// update Post
	@PutMapping("/posts/{id}")
	public List<Post> updatePost(@PathVariable int id, @RequestBody Post post) {
		return postService.updatePost(id, post);

	}

	// delete Post
	@DeleteMapping("/posts/{id}")
	public void deletePost(@PathVariable int id) {
		postService.deletePost(id);
	}
}
