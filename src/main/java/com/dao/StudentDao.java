package com.dao;

import com.entity.*;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//specific class type
@Repository
public class StudentDao {

    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>() {
            {
                put(1, new Student(1, "Sam", "Computer Science"));
                put(2, new Student(2, "Bob", "Art"));
                put(3, new Student(3, "Mary", "Music"));
            }
        };
    }

    public Collection<Student> getAllStudents() {
        return this.students.values();
    }

}