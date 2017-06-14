package com.manitos.xml.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manitos.xml.model.Todo;
import com.manitos.xml.repository.TodoRepository;

@Service
public class TodoServiceImpl implements TodoService {
	
	@Autowired
	TodoRepository todoRepo;

	public List<Todo> findAllTodo() {
		// TODO Auto-generated method stub
		List<Todo> list = todoRepo.findAll();
		return list;
	}

	public Todo findTodoById(Integer id) {
		// TODO Auto-generated method stub
		Todo t = todoRepo.findById(id);
		return t;
	}

}
