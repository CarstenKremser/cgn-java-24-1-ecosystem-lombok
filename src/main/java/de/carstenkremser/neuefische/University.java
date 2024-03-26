package de.carstenkremser.neuefische;

public record University(
        int id,
        String name,
        Course[] courses
) {
}
