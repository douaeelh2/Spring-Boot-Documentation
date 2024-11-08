package com.elhila.taskcrud.controllers;

import com.elhila.taskcrud.dtos.TaskDTO;
import com.elhila.taskcrud.services.TaskService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@WebMvcTest(TaskController.class)
public class TaskControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TaskService taskService;

    private TaskDTO taskDTO;

    @BeforeEach
    public void setup() {
        taskDTO = new TaskDTO();
        taskDTO.setDescription("Test Task");
        taskDTO.setCreatedAt(LocalDateTime.now());
        taskDTO.setUpdatedAt(LocalDateTime.now());
    }

    @Test
    public void testCreateTask() throws Exception {
        Mockito.when(taskService.createTask(Mockito.any(TaskDTO.class))).thenReturn(taskDTO);

        mockMvc.perform(post("/api/tasks")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"description\": \"Test Task\"}"))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.description", is("Test Task")))
                .andDo(print());
    }

    @Test
    public void testGetAllTasks() throws Exception {
        List<TaskDTO> tasks = Arrays.asList(taskDTO);
        Mockito.when(taskService.getAllTasks()).thenReturn(tasks);

        mockMvc.perform(get("/api/tasks"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.size()", is(1)))
                .andExpect(jsonPath("$[0].description", is("Test Task")))
                .andDo(print());
    }

    @Test
    public void testGetTaskById() throws Exception {
        Mockito.when(taskService.getTaskById(1L)).thenReturn(taskDTO);

        mockMvc.perform(get("/api/tasks/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.description", is("Test Task")))
                .andDo(print());
    }

    @Test
    public void testUpdateTask() throws Exception {
        TaskDTO updatedTaskDTO = new TaskDTO();
        updatedTaskDTO.setDescription("Updated Task");
        updatedTaskDTO.setCreatedAt(taskDTO.getCreatedAt());
        updatedTaskDTO.setUpdatedAt(LocalDateTime.now());

        Mockito.when(taskService.updateTask(Mockito.eq(1L), Mockito.any(TaskDTO.class))).thenReturn(updatedTaskDTO);

        mockMvc.perform(put("/api/tasks/1")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"description\": \"Updated Task\"}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.description", is("Updated Task")))
                .andDo(print());
    }

    @Test
    public void testDeleteTask() throws Exception {
        mockMvc.perform(delete("/api/tasks/1"))
                .andExpect(status().isNoContent())
                .andDo(print());

        Mockito.verify(taskService, Mockito.times(1)).deleteTask(1L);
    }
}
