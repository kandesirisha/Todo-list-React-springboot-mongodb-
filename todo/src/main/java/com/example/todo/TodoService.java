package com.example.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    @Autowired
    private TodoRepository repository;

    public List<Todo> getTodos() {
        return repository.findAll();
    }

    public Todo getTodoById(String id) {
        Optional<Todo> todo = repository.findById(id);
        return todo.orElse(null);
    }

    public Todo addTodo(Todo todo) {
        return repository.save(todo);
    }

    public Todo updateTodo(String id, Todo todo) {
        todo.setId(id); // Ensure the ID is set for an update
        return repository.save(todo);
    }

    public void deleteTodo(String id) {
        repository.deleteById(id);
    }
}
