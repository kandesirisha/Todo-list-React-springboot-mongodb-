package com.example.todo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodoRepository extends MongoRepository<Todo, String> {
    // No additional methods are required unless custom queries are needed
}
