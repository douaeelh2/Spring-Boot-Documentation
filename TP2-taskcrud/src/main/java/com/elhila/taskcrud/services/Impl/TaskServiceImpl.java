package com.elhila.taskcrud.services.Impl;

import com.elhila.taskcrud.dtos.TaskDTO;
import com.elhila.taskcrud.entities.Task;
import com.elhila.taskcrud.mapppers.TaskMapper;
import com.elhila.taskcrud.repositories.TaskRepository;
import com.elhila.taskcrud.services.TaskService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private TaskMapper taskMapper;

    @Override
    public TaskDTO createTask(TaskDTO taskDTO) {
        Task task = taskMapper.fromTaskDTO(taskDTO);
        Task savedTask = taskRepository.save(task);
        return taskMapper.fromTask(savedTask);
    }

    @Override
    public List<TaskDTO> getAllTasks() {

        return taskRepository.findAll().stream()
                .map(taskMapper::fromTask)
                .collect(Collectors.toList());
    }

    @Override
    public TaskDTO getTaskById(Long id) {

        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found with ID: " + id));
        return taskMapper.fromTask(task);
    }

    @Override
    public TaskDTO updateTask(Long id, TaskDTO updatedTaskDTO) {

        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found with ID: " + id));

        task.setDescription(updatedTaskDTO.getDescription());
        task.setUpdatedAt(updatedTaskDTO.getUpdatedAt());

        Task updatedTask = taskRepository.save(task);
        return taskMapper.fromTask(updatedTask);
    }

    @Override
    public void deleteTask(Long id) {

        if (!taskRepository.existsById(id)) {
            throw new RuntimeException("Task not found with ID: " + id);
        }
        taskRepository.deleteById(id);
    }
}
