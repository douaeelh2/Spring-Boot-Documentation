package com.elhila.taskcrud.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDateTime;

@Data

public class TaskDTO {
    private Long id;
    @NotBlank(message = "Description cannot be empty")
    @Size(min = 2 ,max = 255, message = "Description cannot exceed 255 characters")
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
