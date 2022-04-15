package com.tw.student;

public class PencilStrategy implements IWritingStrategy {
    @Override
    public String write() {
        return "I'm writing with pencil";
    }
}
