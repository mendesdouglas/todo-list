package com.project.todo.application.services;


import com.project.todo.application.usecases.CreateTodo;
import com.project.todo.application.usecases.UpdateTodo;
import com.project.todo.domain.entities.Todo;
import com.project.todo.domain.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {
    private final TodoRepository todoRepository;
    private final CreateTodo createTodo;
    private final UpdateTodo updateTodo;

    public TodoServiceImpl(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
        this.createTodo = new CreateTodo(todoRepository);
        this.updateTodo = new UpdateTodo(todoRepository);
    }

    @Override
    public List<Todo> getAllTodos(){
        return todoRepository.findAll();
    }

    @Override
    public Todo getTodoById(Long id) {
        return todoRepository.findById(id);
    }

    @Override
    public Todo createTodo(Todo todo){
        return createTodo.execute(todo);
    }

    @Override
    public Todo updateTodo(Long id, Todo todo){
        return updateTodo.execute(id, todo);
    }

    @Override
    public void deleteTodo(Long id){
        todoRepository.deleteById(id);
    }


}








