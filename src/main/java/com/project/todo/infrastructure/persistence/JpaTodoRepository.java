package com.project.todo.infrastructure.persistence;


import com.project.todo.domain.entities.Todo;
import com.project.todo.domain.repositories.TodoRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface JpaTodoRepository extends TodoRepository, JpaRepository<Todo, Long> {
    @Override
    List<Todo> findAll();

    @Override
    Optional<Todo> findById(Long id);

    @Override
    Todo save(Todo todo);

    @Override
    void deleteById(Long id);
}
