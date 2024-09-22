package com.project.todo.application.usecases;

import com.project.todo.domain.entities.Todo;
import com.project.todo.domain.repositories.TodoRepository;

public class CreateTodo {
    private final TodoRepository todoRepository;

    public CreateTodo(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    public Todo execute(Todo todo){
        return todoRepository.save(todo);
    }
}
