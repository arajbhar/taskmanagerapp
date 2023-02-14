package com.practice.springtaskmgrv2.controllers;

import com.practice.springtaskmgrv2.entities.TaskEntity;
import com.practice.springtaskmgrv2.services.TaskServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @Autowired
    private TaskServices taskServices;

    //Create a new Task
    @PostMapping("/tasks")
    public TaskEntity createTask(@RequestBody TaskEntity task){
        return taskServices.createTask(task);
    }


}
