package de.carstenkremser.neuefische;

import java.util.Arrays;

public class UniversityService {
    double calcAverageGrade(Course course) {
        if (!course.getStudents().isEmpty()) {

            double sumOfGrades = course.getStudents()
                    .stream()
                    .mapToDouble(s -> s.grade)
                    .sum();
            return sumOfGrades / course.getStudents().size();
        }
        return 0.0;
    }

    double calcAverageGrade(University university) {
        if(university.courses().length > 0) {
            double sumOfGrades = Arrays.stream(university.courses())
                    .mapToDouble(this::calcAverageGrade)
                    .sum();
            return sumOfGrades / university.courses().length;
        }
        return 0.0;
    }
}
