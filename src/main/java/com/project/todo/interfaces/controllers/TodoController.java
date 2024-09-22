package com.project.todo.interfaces.controllers;

import com.project.todo.application.services.TodoService;
import com.project.todo.domain.entities.Todo;
import com.project.todo.interfaces.dto.TodoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private final TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public List<Todo> getAllTodos(){
        return todoService.getAllTodos();
    }

    @GetMapping("/{id}")
    public Todo getTodoById(@PathVariable Long id){
        return todoService.getTodoById(id);
    }

    @PostMapping
    public Todo createTodo(@RequestBody TodoDto todoDto) {
        Todo todo = new Todo();
        todo.setTitle(todoDto.getTitle());
        todo.setCompleted(todoDto.isCompleted());
        return todoService.createTodo(todo);
    }

    @PutMapping("/{id}")
    public Todo updateTodo(@PathVariable Long id, @RequestBody TodoDto todoDto){
        Todo todo = new Todo();
        todo.setTitle(todoDto.getTitle());
        todo.setCompleted(todoDto.isCompleted());
        return todoService.updateTodo(id, todo);
    }

    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable Long id){
    }

}
