package com.manitos.xml.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.manitos.xml.model.Todo;
import com.manitos.xml.service.TodoService;

@Controller
public class TodoController {
	
	@Autowired
	TodoService todoService;
	
	@RequestMapping(value = "/todo/list", method = RequestMethod.GET)
	String showTodoList(Model model){
		List<Todo> list = todoService.findAllTodo();
		model.addAttribute("todos", list);
		return "lista-todo";
	}
	
	
	
}
