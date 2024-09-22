package com.project.todo.domain.repositories;

import com.project.todo.domain.entities.Todo;

import java.util.List;

public interface TodoRepository {
    List<Todo> findAll();
    Todo findById(Long id);
    Todo save(Todo todo);
    void deleteById(Long id);
}
