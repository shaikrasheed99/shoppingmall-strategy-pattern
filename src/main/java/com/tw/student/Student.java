package com.tw.student;

import com.tw.student.exceptions.NegativeGradeException;

public class Student {
    private final IWritingStrategy writeWith;
    private final int grade;

    public Student(int grade) throws NegativeGradeException {
        this.grade = grade;
        if (isGradeLessThanOrEqualTo(-1)) throw new NegativeGradeException();
        if (isGradeLessThanOrEqualTo(2)) writeWith = new SlatePencilStrategy();
        else if (isGradeLessThanOrEqualTo(5)) writeWith = new PencilStrategy();
        else writeWith = new PenStrategy();
    }

    public String write() {
        return writeWith.write();
    }

    private boolean isGradeLessThanOrEqualTo(int number) {
        return grade <= number;
    }
}
