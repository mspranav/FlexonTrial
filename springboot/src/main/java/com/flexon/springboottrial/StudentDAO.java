package com.flexon.springboottrial;
import java.util.ArrayList;


import org.springframework.stereotype.Service;


@Service
public class StudentDAO {
    ArrayList<Student> students = new ArrayList();
    public ArrayList<Student> findALL() {


        students.add(new Student("Pranav", "Mandadi", 432000));
        students.add(new Student("Siva Pranav", "M", 1759000));
        students.add(new Student("Manish", "Prague", 1280000));
        students.add(new Student("Lokesh", "Warsaw", 1748000));
        students.add(new Student("Gayathree", "Los Angeles", 3971000));

        return students;
    }

    public ArrayList<Student> addstudent(String name, String lastName, Integer phoneNumber) {
        students.add(new Student(name,lastName,phoneNumber));
        return students;
    }

    public int updatename(String name) {
        int index = students.indexOf("Pranav");
        //System.out.println(students.get(index));
        String num = "1";
        String vari = students.get(index).toString();
        return  Integer.parseInt(num);

    }

    public void deletestudent(int phoneNum) {
        int index = students.indexOf(phoneNum);

    }

    public void deletestudent() {
    }
}
