package com.tw.student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {
    @Test
    void shouldWriteWithSlatePencilWhenGradeIsLessThanOrEqualTwo() {
        Student student = new Student(2);

        assertEquals("I'm writing with pencil", student.write());
    }
}
