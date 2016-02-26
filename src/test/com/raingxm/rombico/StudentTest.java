package com.raingxm.rombico;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class StudentTest {
    private Student[] students;

    @Before
    public void setUp() {
        students = new Student[3];
        students[0] = new Student(20, "raingxm");
        students[1] = new Student(32, "zhangxu");
        students[2] = new Student(17, "nana");
    }

    @Test
    public void shouldFindStudentByAge() throws Exception {
        assertThat(Student.findByAge(students), notNullValue());
    }

    @Test
    public void shouldFindStudentByName() throws Exception {
        assertThat(Student.findByName(students), notNullValue());
    }
}