package com.elhila.taskcrud.mapppers;

import com.elhila.taskcrud.dtos.TaskDTO;
import com.elhila.taskcrud.entities.Task;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class TaskMapper {

    public TaskDTO fromTask(Task task) {
        TaskDTO taskDTO = new TaskDTO();
        BeanUtils.copyProperties(task, taskDTO);
        return taskDTO;
    }

    public Task fromTaskDTO(TaskDTO taskDTO) {
        Task task = new Task();
        BeanUtils.copyProperties(taskDTO, task);
        return task;
    }
}
