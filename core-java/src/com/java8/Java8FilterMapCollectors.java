package com.java8;

import java.util.*;
import java.util.stream.Collectors;

public class Java8FilterMapCollectors {

    public static void main(String[] arg) {
        List<Student> students = StudentRecordFactory.generateStudents();
        //1. Find the list of students whose rank is greater than 160 living in Pune

        List<Student> filteredStudents = students.stream().filter(student -> student.getRank() > 160 && student.getCity().equalsIgnoreCase("PUNE")).toList();
        System.out.println(filteredStudents);

        //2.Filter the students living in Chennai and [[[[[[[[[/sort them using their name

        System.out.println("\n2.Filter the students living in Chennai and sort them using their name");
        List<Student> chennaiStudents = students.stream()
                .filter(student -> student.getCity() != null && student.getCity().equalsIgnoreCase("Chennai"))
                .sorted(Comparator.comparing(Student::getGender,Comparator.reverseOrder()))
                .toList();
        System.out.println(chennaiStudents);

        //3.Find All Department Names
        System.out.println("\n3.Find All Department Names");
        List<String> departments= students.stream()
                .map(Student::getDepartment)
                .distinct()
                .collect(Collectors.toList());

        Set<String> deptSet = students.stream()
                .map(Student::getDepartment)
                .collect(Collectors.toSet());

        Set<String> deptSet1 = students.stream()
                .map(student -> student.getDepartment())//Map takes a lambda expression to transform element into another one or extract information
                .collect(Collectors.toSet());

        System.out.println(departments);
        System.out.println(deptSet1);

        //4.Find All Contact Numbers
        System.out.println("\n4.Find All Contact Numbers");
        List<List<String>> contactNumbers = students.stream()
                .map(Student::getContacts) // this will return list of String(this is one to many relationship hence use flatmap
                .distinct()
                .toList();
        System.out.println(contactNumbers);

        List<String> listOfContacts = students.stream()
                .flatMap(student -> student.getContacts().stream()) // this will return list of String(this is one to many relationship hence use flatmap
                .distinct()
                .toList();
        System.out.println(listOfContacts);

        //5. Group the students department wise
        System.out.println("\n5. Group the students department wise");
        Map<String, List<Student>> departmentStudentMap = students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment));
        System.out.println(departmentStudentMap);

        //6. Get count of students in each deparmtment.
        System.out.println("\n6. Get count of students in each department.");
        Map<String, Long> departmentWiseCount = students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment, Collectors.counting()));
        System.out.println(departmentWiseCount);


        //6.1 Get department with highest average rank.
        System.out.println("\n6.1 Get department with highest average rank.");
        Map.Entry<String, Double> departmentHighestStudent = students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment, Collectors.averagingLong(Student::getRank)))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue()).get();
        System.out.println(departmentHighestStudent);

        //6.1 Get average rank for each gender.
        System.out.println("\n6.2 Get average rank for each gender.");
        Map<String, Double> genderWiseAverageRank = students.stream()
                .collect(Collectors.groupingBy(Student::getGender, Collectors.averagingDouble(Student::getRank)));
        System.out.println(genderWiseAverageRank);

        //Find highest rank in each department
        System.out.println("\nFind highest rank in each department");
/*      //Step-1 group the students by department name and then perform next step.
        Map<String, List<Student>> departmentWiseHighestRank = students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment));
        System.out.println(departmentWiseHighestRank);*/

        Map<String, Optional<Student>> departmentWiseHighestRank2 = students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment,
                        Collectors.minBy(Comparator.comparing(Student::getRank))));
        System.out.println(departmentWiseHighestRank2);

        System.out.println("\nFind second highest rank");
        Optional<Student> secondRankedStudent = students.stream()
                .sorted(Comparator.comparing(Student::getRank))
                .skip(1)
                .findFirst();
        System.out.println(secondRankedStudent);

    }
}
