package com.example.EventManagement.controller;

import com.example.EventManagement.model.Student;
import com.example.EventManagement.model.Type;
import com.example.EventManagement.service.StudentService;
import jakarta.validation.constraints.Pattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    //get all students
    @GetMapping("students")
    public Iterable<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    //add single student
    @PostMapping("student")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

//    get student by id
    @GetMapping("student/{id}")
    public Student getStudentById(@PathVariable Integer id){
       return  studentService.getStudentById(id);
    }

    //save all
    @PostMapping("students")
    public String addStudents(@RequestBody List<Student> students){
        return studentService.addStudents(students);
    }

    //delete student
    @DeleteMapping("student/{id}")
    public String deleteStudentById(@PathVariable Integer id){
        return studentService.deleteStudentById(id);
    }


    //update department
    @PutMapping("student/{id}/{type}")
    public String updateStudentDepartment(@PathVariable Integer id, @PathVariable Type type){
        return studentService.updateStudentDepartment(id,type);
    }


}
