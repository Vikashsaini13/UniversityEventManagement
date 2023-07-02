package com.example.EventManagement.service;

import com.example.EventManagement.model.Student;
import com.example.EventManagement.model.Type;
import com.example.EventManagement.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    IStudentRepo iStudentRepo;
    public Iterable<Student> getAllStudents() {
        return iStudentRepo.findAll();
    }

    public Student getStudentById(Integer id) {
      Optional<Student> studentOpt= iStudentRepo.findById(id);
      return studentOpt.get();

    }
    public String addStudent(Student student) {
        iStudentRepo.save(student);
        return "added";
    }


    public String addStudents(List<Student> students) {
         iStudentRepo.saveAll(students);
         return "added students successfully";
    }

    public String deleteStudentById(Integer id) {
        iStudentRepo.deleteById(id);
        return "deleted";
    }

    public String updateStudentDepartment(Integer id, Type type) {
        Optional<Student> student = iStudentRepo.findById(id);
        Student student1;
        if(student.isPresent())
        {
            student1 = student.get();
        }
        else {
            return "Id not Found!!!";
        }
        student1.setDepartment(type);
        iStudentRepo.save(student1);
        return "room type updated";

    }
}
