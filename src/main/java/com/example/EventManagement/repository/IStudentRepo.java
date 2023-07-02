package com.example.EventManagement.repository;

import com.example.EventManagement.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepo extends CrudRepository<Student,Integer> {

}
