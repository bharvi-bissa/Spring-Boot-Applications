package com.springbootapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;

@Entity
@Table(name = "posts")
@DynamicInsert(value = true)
public class Post {

	@Id
	@Column(name = "post_id")
	private int id;

	@Column(name = "post_name")
	private String name;

	@Column(name = "post_desc")
	private String description;

	public Post() {
	}

	public Post(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", name=" + name + ", description=" + description + "]";
	}

}
