package com.raingxm.rombico;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class StudentTest {
    private List<Student> students;

    @Before
    public void setUp() {
        students = Arrays.asList(new Student(20, "zhangsan"), new Student(17, "liyu"), new Student(22, "zhangxu"));
    }

    @Test
    public void shouldFindStudentByAge() throws Exception {
        assertThat(Student.find(students, s -> s.getAge() == 17), notNullValue());
    }

    @Test
    public void shouldFindStudentByName() throws Exception {
        assertThat(Student.find(students, s -> s.getName().equals("zhangxu")), notNullValue());
    }
}