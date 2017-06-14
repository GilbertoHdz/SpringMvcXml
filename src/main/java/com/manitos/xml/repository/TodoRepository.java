package com.manitos.xml.repository;

import java.util.List;

import com.manitos.xml.model.Todo;

public interface TodoRepository {
	
	List<Todo> findAll();
	Todo findById(Integer id);
	
}
