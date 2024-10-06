package com.task_management.taskManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.task_management.taskManagement.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    // Custom query methods if necessary
    List<Task> findByTitle(String title);
}
