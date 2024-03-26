package de.carstenkremser.neuefische;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class Course {
    int id;
    String name;
    Teacher teacher;
    List<Student> students;
}
