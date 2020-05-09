package com.resourceauthenication.springboot.web.service;

import java.util.List;

import com.resourceauthenication.springboot.web.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Integer> {
	List<Todo> findByUser(String user);
}
