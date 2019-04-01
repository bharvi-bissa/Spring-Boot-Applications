package com.springbootapi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootapi.model.Post;
import com.springbootapi.repository.PostRepository;

@Service
public class PostServiceImpl implements PostService {

	@Autowired
	PostRepository postRepository;

	@Override
	public List<Post> getAllPosts() {
		List<Post> postList = new ArrayList<>();
		postRepository.findAll().forEach(postList::add);
		return postList;
	}

	@Override
	public Optional<Post> getPost(int id) {
		return postRepository.findById(id);
	}

	@Override
	public List<Post> updatePost(int id, Post post) {

		System.out.println(post);
		Post postTopUpdate = postRepository.findById(id).get();
		postTopUpdate.setName(post.getName());
		postTopUpdate.setDescription(post.getDescription());
		postRepository.save(postTopUpdate);

		return getAllPosts();
	}

	@Override
	public List<Post> createPost(Post post) {
		postRepository.save(post);
		return getAllPosts();
	}

	@Override
	public void deletePost(int id) {
		postRepository.deleteById(id);

	}
}
