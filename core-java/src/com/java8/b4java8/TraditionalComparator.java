package com.java8.b4java8;

import com.java8.factory.Student;
import com.java8.factory.StudentRecordFactory;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TraditionalComparator {
    public static void main(String[] args) {
        List<Student> students = StudentRecordFactory.generateStudents();

        Collections.sort(students,new MyComparator());// Option 1 Earlier
        System.out.println(students.stream().map(Student::getFirstName).distinct().toList());

        Collections.sort(students, new Comparator<Student>(){


            @Override
            public int compare(Student o1, Student o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        System.out.println(students.stream().map(Student::getLastName).distinct().toList());

        //Modern Java 8
   Collections.sort(students, (s1,s2)->{return s1.getLastName().compareTo(s2.getLastName());});

        Comparator<Student> myComp =  new Comparator<Student>(){


            @Override
            public int compare(Student o1, Student o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        };

        System.out.println(students);

        Collections.sort(students, myComp);
    }

}

class MyComparator implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getFirstName().compareTo(s2.getFirstName());
    }
}