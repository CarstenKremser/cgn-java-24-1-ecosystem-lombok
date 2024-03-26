package de.carstenkremser.neuefische;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class Student {
    int id;
    String name;
    String address;
    String grade;
}
