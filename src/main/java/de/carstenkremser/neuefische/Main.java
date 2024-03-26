package de.carstenkremser.neuefische;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[]{
                new Student(1,"Anna","Musterstraße 123, 12345 Musterstadt",2.0),
                new Student(2,"Bruno","Blahweg 27, 93175 Xyzstadt",3.1),
                new Student(3,"Carla","Blubballee 64, 76143 Blubbingen",2.5),
                new Student(4,"Dirk","Zuhause 94, 28417 Irgendwo",1.8),
                new Student(5,"Emma","Hier 99, 19762 Dorf",2.1)
        };

        Teacher[] teachers = new Teacher[]{
                new Teacher(1,"Müller", "french, english"),
                new Teacher(2,"Meier", "english, geography"),
                new Teacher(3,"Schmidt", "french, physics")
        };

        List<Course> courses = new ArrayList<>();

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
        aStudent.setGrade(3.5);
        System.out.println(aStudent);
        aStudent.setId(11);
        System.out.println(aStudent);

        Student anotherStudent = new Student.StudentBuilder()
                .id(50)
                .name("Xaver")
                .address("Ichwohneda 45, 32164 ABCStadt")
                .grade(2.7)
                .build();
        System.out.println(anotherStudent);

        Course physicsCourse = new Course.CourseBuilder()
                .id(42)
                .name("physics for dummies")
                .teacher(teachers[2])
                .students(Arrays.stream(students).toList())
                .build();
        System.out.println(physicsCourse);

        Course changedPhysicsCourse = physicsCourse.withTeacher(teachers[0]);
        System.out.println("--- changed teacher: two distinct objects");
        System.out.println(physicsCourse);
        System.out.println(changedPhysicsCourse);
    }
}