package de.carstenkremser.neuefische;

import lombok.*;

@Data
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    int id;
    String name;
    String address;
    String grade;
}
