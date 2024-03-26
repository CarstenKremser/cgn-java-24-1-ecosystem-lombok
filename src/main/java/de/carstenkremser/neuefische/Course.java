package de.carstenkremser.neuefische;

import lombok.*;

import java.util.List;

@Data
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Course {
    int id;
    String name;
    @With
    Teacher teacher;
    List<Student> students;
}
