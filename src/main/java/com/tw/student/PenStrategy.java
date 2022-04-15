package com.tw.student;

public class PenStrategy implements IWritingStrategy {
    @Override
    public String write() {
        return "I'm writing with pen";
    }
}
