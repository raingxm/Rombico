package com.raingxm.rombico;

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

    public static Student find(Iterable<Student> students, StudentPredicate p) {
        for(Student s : students) {
            if(p.test(s)) {
                return s;
            }
        }
        return null;
    }

    public static void main(String[] args) {

    }
}
