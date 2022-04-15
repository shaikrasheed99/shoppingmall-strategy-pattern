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

        assertEquals("I'm writing with pencil", student.write());
    }
}
