package com.springbootapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PostApiApp {

	/*
	 * main method functions :
	 * 
	 * Sets up default configuration
	 * 
	 * Starts Spring application context
	 * 
	 * Performs class path scan
	 * 
	 * Starts Tomcat server
	 */
	/*
	 * Always create your other packages as sub packages like for main method
	 * com.springbootapi and for others com.springbootapi.<name> otherwise spring
	 * won't load the classes
	 */
	public static void main(String[] args) {
		SpringApplication.run(PostApiApp.class, args);
	}

}
