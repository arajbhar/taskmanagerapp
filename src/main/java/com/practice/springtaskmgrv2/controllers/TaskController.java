package com.practice.springtaskmgrv2.controllers;

import com.practice.springtaskmgrv2.entities.TaskEntity;
import com.practice.springtaskmgrv2.services.TaskServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @GetMapping("/tasks")
    public List<TaskEntity> getAllTask(){
        return taskServices.getAllTasks();
    }


}
