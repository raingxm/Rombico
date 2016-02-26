package com.raingxm.rombico;

import org.junit.Before;
import org.junit.Test;

public class StudentTest {
    @Before
    public void setUp() {
        Student[] students = new Student[3];
        students[0] = new Student(20, "raingxm");
        students[1] = new Student(32, "zhangxu");
        students[2] = new Student(62, "nana");
    }

    @Test
    public void testFindStudentByAge() throws Exception {

    }
}