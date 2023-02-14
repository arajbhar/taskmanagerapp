package com.practice.springtaskmgrv2.controllers;

import com.practice.springtaskmgrv2.entities.TaskEntity;
import com.practice.springtaskmgrv2.services.TaskServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TaskController {

    @Autowired
    private TaskServices taskServices;

    //Create a new Task
    @PostMapping("/tasks")
    public TaskEntity createTask(@RequestBody TaskEntity task){
        System.out.println("task due_date : " + task.getDueDate());
        return taskServices.createTask(task);
    }

    //get all task
    @GetMapping("/tasks")
    public List<TaskEntity> getAllTask(){
        return taskServices.getAllTasks();
    }

    @GetMapping("/tasks/{id}")
    public Optional<TaskEntity> getTaskById(@PathVariable(value = "id") Integer taskId){
        return taskServices.getTaskById(taskId);

    }


}
