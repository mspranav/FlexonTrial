package com.flexon.springboottrial;

public class Student {
    private String name;
    private String lastName;
    private int phoneNum;

    public Student(String name, String lastName, int phoneNum){
        this.name = name;
        this.lastName = lastName;
        this.phoneNum = phoneNum;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public int getPhoneNum(){
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum){
        this.phoneNum = phoneNum;
    }
}
