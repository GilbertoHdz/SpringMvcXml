package com.manitos.xml.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.manitos.xml.model.Todo;

@Repository
public class TodoRepositoryMap implements TodoRepository{
	
	private Map<Integer, Todo> dataStore = new HashMap<Integer, Todo>();
	private Integer sequence;
	
	public TodoRepositoryMap(){
		sequence=1;
		loadDataStore();
	}
	
	private void loadDataStore(){
		Integer generatedNextId = getNextValue();
		Todo t1 = new Todo();
		
		t1.setId(generatedNextId);
		t1.setNombre("Home Works");
	}
	
	private Integer getNextValue(){
		return sequence++;
	}

	public List<Todo> findAll() {
		// TODO Auto-generated method stub
		ArrayList<Todo> lista = new ArrayList<Todo>();
		lista.addAll(dataStore.values());
		return lista;
	}

	public Todo findById(Integer id) {
		// TODO Auto-generated method stub
		Todo t = dataStore.get(id);
		return t;
	}

}
