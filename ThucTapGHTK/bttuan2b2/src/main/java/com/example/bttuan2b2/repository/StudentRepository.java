package com.example.bttuan2b2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bttuan2b2.entities.studentEntity;
import com.example.bttuan2b2.model.student;


@Repository
public interface StudentRepository extends JpaRepository<studentEntity,String>{

    @Override
    List<studentEntity> findAll();
    
    

}
