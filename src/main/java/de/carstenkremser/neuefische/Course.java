package de.carstenkremser.neuefische;

import lombok.*;

import java.util.List;

@Value // is immutable Variant of @Data - see: https://projectlombok.org/features/Value
@Builder
public class Course {
    int id;
    String name;
    @With
    Teacher teacher;
    List<Student> students;
}
