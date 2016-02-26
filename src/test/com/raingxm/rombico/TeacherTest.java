package com.raingxm.rombico;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static com.raingxm.rombico.Teacher.find;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;


public class TeacherTest {

    private List<Teacher> teachers;

    @Before
    public void setUp() {
        teachers = Arrays.asList(new Teacher("jianguo", "male"), new Teacher("marry", "female"));
    }

    @Test
    public void shouldAbleFindFirstFemaleTeacher() throws Exception {
        assertThat(find(teachers, t -> t.female().equals("female")), notNullValue());
    }
}