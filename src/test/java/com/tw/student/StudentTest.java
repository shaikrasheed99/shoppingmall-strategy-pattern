package com.tw.student;

import com.tw.student.exceptions.NegativeGradeException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentTest {
    @Test
    void shouldNotCreateStudentWithNegativeGrade() {
        assertThrows(NegativeGradeException.class, () -> new Student(-1));
    }

    @Test
    void shouldWriteWithSlatePencilWhenGradeIsLessThanOrEqualTwo() throws NegativeGradeException {
        Student student = new Student(2);

        assertEquals("I'm writing with slate pencil", student.write());
    }

    @Test
    void shouldWriteWithPencilWhenGradeIsLessThanOrEqualToFiveAndGreaterThanTwo() throws NegativeGradeException {
        Student student = new Student(4);

        assertEquals("I'm writing with pencil", student.write());
    }

    @Test
    void shouldWriteWithPenWhenGradeIsMoreThanFive() throws NegativeGradeException {
        Student student = new Student(7);

        assertEquals("I'm writing with pen", student.write());
    }
}
