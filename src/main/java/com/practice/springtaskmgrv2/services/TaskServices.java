package com.practice.springtaskmgrv2.services;

import com.practice.springtaskmgrv2.entities.TaskEntity;
import com.practice.springtaskmgrv2.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServices {

    @Autowired
    private TaskRepository taskRepository;

    public TaskEntity createTask(TaskEntity task){
        return taskRepository.save(task);
    }

    public List<TaskEntity> getAllTasks(){
        return taskRepository.findAll();
    }

    public Optional<TaskEntity> getTaskById(Integer taskId){
        return taskRepository.findById(taskId);
    }
}
