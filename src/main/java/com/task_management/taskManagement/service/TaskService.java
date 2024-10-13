package com.task_management.taskManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.task_management.taskManagement.model.Task;
import com.task_management.taskManagement.repository.TaskRepository;
import java.util.List;

@Service
public class TaskService {

      @Autowired
    private TaskRepository taskRepository;

    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    public List<Task> findByTitle(@PathVariable String title) {
        return taskRepository.findByTitle(title);
    }

}
