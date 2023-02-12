package com.practice.springtaskmgrv2.entities;

import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;

import java.sql.Timestamp;
import java.util.Date;

@MappedSuperclass
@Getter
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id",nullable = false)
    private Integer id;

    @CreatedDate
    @Column(name = "created_at",columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date createdAt;


}
