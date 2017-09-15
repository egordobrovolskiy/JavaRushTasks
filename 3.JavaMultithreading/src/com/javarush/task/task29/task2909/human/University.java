package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.List;

public class University {

    private String name;
    private int age;
    private List<Student> students = new ArrayList<>();


    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public University(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student getStudentWithAverageGrade(double averageGrade) {
        //TODO:
        Student st = null;
        for (Student student : students) {
            if (averageGrade == student.getAverageGrade()) st = student;
        } return st;
    }

    public Student getStudentWithMaxAverageGrade() {
        //TODO:
        double max = students.get(0).getAverageGrade();
        Student st = null;
        for (Student student : students) {
            if (student.getAverageGrade() > max) max = student.getAverageGrade();
        }
        for (Student student : students) {
            if (max == student.getAverageGrade()) st = student;
        }
        return st;
    }

    public Student getStudentWithMinAverageGrade() {
        //TODO:
        double min = students.get(0).getAverageGrade();
        Student st = null;
        for (Student student : students) {
            if (student.getAverageGrade() < min) min = student.getAverageGrade();
        }
        for (Student student : students) {
            if (min == student.getAverageGrade()) st = student;
        }
      //  expel(st);
        return st;
    }
    public void expel(Student student) {
        students.remove(student);
    }
}