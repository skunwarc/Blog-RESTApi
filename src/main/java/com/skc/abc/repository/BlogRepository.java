package com.skc.abc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skc.abc.model.Blog;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Integer>{
	
	List<Blog> findByTitleContainingOrContentContaining(String text, String textAgain);
	
}
/*
repository talks to the database
JpaRepository gives us the some functionality out of the box such as fetching, 
saving, updating, deleting etc.


Format of repository class:

@Repository
public interface {repository class name} extends JpaRepository <{Entity class},{Data type of Primary Key}>{
	.. we can define our specific queries here
}


*/