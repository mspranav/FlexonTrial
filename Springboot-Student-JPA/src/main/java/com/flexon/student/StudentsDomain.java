package com.flexon.student;

import javax.persistence.*;
//import java.security.PrivateKey;

@Entity
@Table(name = "students")
public class StudentsDomain {

    public String name;
    public int phoneNumber;
    public String gender;
    public String emailAddress;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    public StudentsDomain() {};

    public Integer getStudentID() {
        return id;
    }
    public void setStudentID(Integer ID) {
        ID = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }



}
