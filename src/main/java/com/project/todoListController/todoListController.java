package com.project.todoListController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/todos")
public class todoListController {

    @GetMapping()
    public List<String> getTodos() {
        return List.of("Tarefa1");
    }

}
