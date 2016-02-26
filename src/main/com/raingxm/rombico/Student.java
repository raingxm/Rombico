package com.raingxm.rombico;

import javax.sound.midi.Sequencer;

public class Student {
    private int age;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public static Student findByAge(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getAge() == 17) {
                return students[i];
            }
        }

        return null;
    }

    public static Student findByName(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getName().equals("zhangxu")) {
                return students[i];
            }
        }

        return null;
    }

    public static void main(String[] args) {

    }
}
