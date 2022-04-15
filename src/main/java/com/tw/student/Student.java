package com.tw.student;

public class Student {
    private IWritingStrategy writeWith;

    public Student(int grade) {
        if (grade <= 2) {
            writeWith = new SlatePencilStrategy();
        }
    }

    public String write() {
        return writeWith.write();
    }
}
