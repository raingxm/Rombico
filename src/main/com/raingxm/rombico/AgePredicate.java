package com.raingxm.rombico;

public class AgePredicate implements StudentPredicate {
    private int age;

    public AgePredicate(int age) {
        this.age = age;
    }

    @Override
    public boolean test(Student s) {
        return s.getAge() == age;
    }
}
