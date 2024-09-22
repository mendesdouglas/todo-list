package com.project.todo.application.usecases;

import com.project.todo.domain.entities.Todo;
import com.project.todo.domain.repositories.TodoRepository;

public class UpdateTodo {
    private final TodoRepository todoRepository;

    public UpdateTodo(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    public Todo execute(Long id, Todo todo){
        todo.setId(id);
        return todoRepository.save(todo);
    }
}
