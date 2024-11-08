package com.elhila.taskcrud.services;

import com.elhila.taskcrud.dtos.TaskDTO;
import java.util.List;

public interface TaskService {
    TaskDTO createTask(TaskDTO taskDTO);
    List<TaskDTO> getAllTasks();
    TaskDTO getTaskById(Long id);
    TaskDTO updateTask(Long id, TaskDTO updatedTaskDTO);
    void deleteTask(Long id);
}
