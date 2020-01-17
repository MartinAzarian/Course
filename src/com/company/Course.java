package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Course {
    private String name = "";
    private String description = "";
    private ArrayList<Student> students = new ArrayList<>();
    private double duration = 0;
    private Lecturer lecturer;

    public enum RATING {
        ONE, TWO, THREE, FOUR, FIVE
    }

    //Seters


    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void setStudents(Student student) {
        this.students.add(student);
    }

//geters


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }


    public double getDuration() {
        return duration;
    }


    public Course() {
    }
    // method

    public void removeStudent(String firstName, String lastName) {
        for (int i = 0; i < students.size(); i++) {
            if (firstName.equals(students.get(i).getFirstName())) {
                if (lastName.equals(students.get(i).getLastName())) {
                    students.remove(i);
                }
            }
        }

    }




}




