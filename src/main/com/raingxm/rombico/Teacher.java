package com.raingxm.rombico;

public class Teacher {
    private String name;
    private String female;

    public Teacher(String name, String female) {
        this.name = name;
        this.female = female;
    }

    public String female() {
        return female;
    }

    public static Teacher find(Iterable<Teacher> teachers, TeacherPredicate p) {
        for(Teacher t : teachers) {
            if(p.test(t)) {
                return t;
            }
        }

        return null;
    }
}
