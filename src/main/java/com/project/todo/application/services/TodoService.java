package com.project.todo.application.services;

import com.project.todo.application.usecases.CreateTodo;
import com.project.todo.application.usecases.UpdateTodo;
import com.project.todo.domain.entities.Todo;
import com.project.todo.domain.repositories.TodoRepository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;


public interface TodoService {
    List<Todo> getAllTodos();
    Todo getTodoById(Long id);
    Todo createTodo(Todo todo);
    Todo updateTodo(Long id, Todo todo);
    void deleteTodo(Long id);


}
