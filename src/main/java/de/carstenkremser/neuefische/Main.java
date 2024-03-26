package de.carstenkremser.neuefische;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[]{
                new Student(1,"Anna","Musterstraße 123, 12345 Musterstadt","none"),
                new Student(2,"Bruno","Blahweg 27, 93175 Xyzstadt","none"),
                new Student(3,"Carla","Blubballee 64, 76143 Blubbingen","none"),
                new Student(4,"Dirk","Zuhause 94, 28417 Irgendwo","none"),
                new Student(5,"Emma","Hier 99, 19762 Dorf","none")
        };

        Teacher[] teachers = new Teacher[]{
                new Teacher(1,"Müller", "french, english"),
                new Teacher(2,"Meier", "english, geography"),
                new Teacher(3,"Schmidt", "french, physics")
        };

        List<Course> courses = new ArrayList<>();
        Arrays.stream(new Student[]{students[0]}).toList();
        courses.add(new Course(1,"english beginners",teachers[1],
                Arrays.stream(new Student[]{students[0],students[3],students[4]}).toList()));
        courses.add(new Course(2,"french beginners",teachers[2],
                Arrays.stream(new Student[]{students[1],students[4]}).toList()));

        System.out.println(courses.get(0));
        System.out.println(courses.get(1));

        Student aStudent = new Student();
        aStudent.setId(99);
        aStudent.setName("Zoe");
        aStudent.setAddress("Heimweg 21, 74892 Hierunddort");
        aStudent.setGrade("unknown");
        System.out.println(aStudent);
        aStudent.setId(11);
        System.out.println(aStudent);
    }
}