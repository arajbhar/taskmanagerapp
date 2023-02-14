package com.practice.springtaskmgrv2.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Getter
@Setter
@Entity(name = "tasks")
public class TaskEntity extends BaseEntity{

    @Column(name = "title",nullable = false,length = 150)
    String title;

    @Column(name = "description",nullable = true,length = 500)
    String description;

    @Column(name = "completed",nullable = false,columnDefinition = "boolean default false")
    Boolean completed;

    @Column(name = "due_Date",nullable = true)
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    Date dueDate;


}
