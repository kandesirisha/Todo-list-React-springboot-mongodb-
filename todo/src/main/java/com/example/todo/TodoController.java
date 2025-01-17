package com.example.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
@CrossOrigin(origins = "http://localhost:5173")
public class TodoController {

    @Autowired
    private TodoService service;

    @GetMapping
    public List<Todo> getTodos() {
        return service.getTodos();
    }

    @GetMapping("/{id}")
    public Todo getTodoById(@PathVariable("id") String id) {
        return service.getTodoById(id);
    }

    @PostMapping
    public Todo addTodo(@RequestBody Todo todo) {
        return service.addTodo(todo);
    }

    @PutMapping("/{id}")
    public Todo updateTodo(@PathVariable("id") String id, @RequestBody Todo todo) {
        return service.updateTodo(id, todo);
    }

    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable("id") String id) {
        service.deleteTodo(id);
    }
}
