package com.flexon.student;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    public StudentRepository service;

    @GetMapping
    public List<StudentsDomain> getAllStudents(){
        return service.findAll();
    }

    @PostMapping("/studentcreate")
    @ResponseStatus(HttpStatus.CREATED)
    public void createStudent(@RequestBody StudentsDomain student) {
        service.save(student);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteStudent(@PathVariable int id){
       service.deleteById(id);

    }

    @PutMapping("/update/{id}/{name}")
    public StudentsDomain updateStudent(@RequestBody StudentsDomain student){
       return service.save(student);

    }

    @PatchMapping("/update/{id}")
    public StudentsDomain updateStudentPatch(@RequestBody StudentsDomain student, @PathVariable("id") int id){

//        return service.save(student,id);
    }


}
