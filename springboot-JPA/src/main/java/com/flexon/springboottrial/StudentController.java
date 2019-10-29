package com.flexon.springboottrial;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class StudentController {

    @Autowired
    private StudentDAO  studentService;

    @GetMapping(value = "/flexon")
    public List<Student> getstudents(){
        ArrayList<Student> students = studentService.findALL();
        return students;
    }
    @PostMapping(value = "/addstudent/{name}/{lastname}/{phoneNumber}")
    public List<Student> setstudent(@PathVariable String name, @PathVariable String lastname, @PathVariable Integer phoneNumber){
        ArrayList<Student> addedstudent = studentService.addstudent(name, lastname, phoneNumber);
        return addedstudent;
    }

    @PutMapping(value = "/student/edit/name/{name}")
    public int editstudentname(@PathVariable String name){
        return studentService.updatename(name);

    }
    @DeleteMapping(value = "/student/delete/{phonenumber}"){
        public void deletestudent(@PathVariable int phonenumber){
            studentService.deletestudent(phonenumber);
        }
    }





}
