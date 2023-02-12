package com.practice.springtaskmgrv2.repositories;

import com.practice.springtaskmgrv2.entities.NotesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotesRepository extends JpaRepository<NotesEntity,Integer> {
}
