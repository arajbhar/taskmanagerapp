package com.practice.springtaskmgrv2.services;

import com.practice.springtaskmgrv2.entities.TaskEntity;
import com.practice.springtaskmgrv2.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServices {

    @Autowired
    private TaskRepository taskRepository;

    public TaskEntity createTask(TaskEntity task){
        return taskRepository.save(task);
    }
}