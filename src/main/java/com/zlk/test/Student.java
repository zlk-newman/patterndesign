package com.zlk.test;

public class Student {
    private String name;
    private String pwd;
    private int age;

    private Teacher teacher;

    public void doStuding(){
        System.out.println("I am playing...ha ha ha");
    }

    public Student() {
    }


    public Student(String name, String pwd, int age, Teacher teacher) {
        this.name = name;
        this.pwd = pwd;
        this.age = age;
        this.teacher = teacher;
    }



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", age=" + age +
                ", teacher=" + teacher +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
