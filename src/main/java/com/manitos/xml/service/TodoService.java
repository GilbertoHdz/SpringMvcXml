package com.manitos.xml.service;

import java.util.List;

import com.manitos.xml.model.Todo;

public interface TodoService {
	
	List<Todo> findAllTodo();
	Todo findTodoById(Integer id);
	
}
