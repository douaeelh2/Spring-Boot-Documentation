package com.elhila.taskcrud.repositories;

import com.elhila.taskcrud.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}