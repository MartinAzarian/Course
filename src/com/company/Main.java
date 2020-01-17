package com.company;

public class Main {

    public static void main(String[] args) {
        Course course = new Course();
        Student student = new Student();
        student.setFirstName("asd");
        student.setLastName("Asdsa");
        course.setStudents(student);
    }
}
