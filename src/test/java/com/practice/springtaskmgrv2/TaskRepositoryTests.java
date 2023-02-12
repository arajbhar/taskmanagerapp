package com.practice.springtaskmgrv2;


import com.practice.springtaskmgrv2.entities.TaskEntity;
import com.practice.springtaskmgrv2.repositories.TaskRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
public class TaskRepositoryTests {

    @Autowired
    TaskRepository taskRepository;
    @Test
    public void saveTaskTest(){
        TaskEntity task=new TaskEntity();
        task.setTitle("Title 1");
        task.setDescription("title 1 description");
        task.setCompleted(false);
        var saveTask=taskRepository.save(task);
        assertNotNull(saveTask);
    }

    @Test
    public void findAllTaskTest(){
        TaskEntity task1 = new TaskEntity();
        TaskEntity task2 = new TaskEntity();

        task1.setTitle("task1");
        task1.setDescription("task1 desc");
        task1.setCompleted(false);

        task2.setTitle("task2");
        task2.setDescription("task2 desc");
        task2.setCompleted(false);

        taskRepository.save(task1);
        taskRepository.save(task2);

        List<TaskEntity> taskEntityList = taskRepository.findAll();
        assertEquals(2,taskEntityList.size());
    }

}
