package com.java8.factory;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class StudentRecordFactory {
    public static List<Student> generateStudents() {
        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Krishna", "Das", "Male", "Biotech Engineering", "Chennai", 172, Arrays.asList("+919279281688")));
        students.add(new Student(2, "Reyansh", "Jain", "Male", "Mechanical Engineering", "Pune", 278, Arrays.asList("+916693633801", "+919280305443")));
        students.add(new Student(3, "Vivaan", "Nair", "Male", "Electronics Engineering", "Chennai", 207, Arrays.asList("+916404149892")));
        students.add(new Student(4, "Krishna", "Singh", "Female", "Electronics Engineering", "Mumbai", 58, Arrays.asList("+917764694871", "+918311996447")));
        students.add(new Student(5, "Krishna", "Kumar", "Female", "Biotech Engineering", "Mumbai", 20, Arrays.asList("+918645196062", "+919481045330", "+918607827695")));
        students.add(new Student(6, "Ayaan", "Patel", "Female", "Computer Engineering", "Karnataka", 73, Arrays.asList("+917620409685", "+918051269225", "+919464481924")));
        students.add(new Student(7, "Sai", "Nair", "Male", "Electronics Engineering", "Pune", 153, Arrays.asList("+916580252715", "+916857647577", "+919992576834")));
        students.add(new Student(8, "Aarav", "Verma", "Female", "Computer Engineering", "Mumbai", 283, Arrays.asList("+916021470887")));
        students.add(new Student(9, "Zentih", "Das", "Female", "Instrumentation Engineering", "Chennai", 154, Arrays.asList("+917859736913", "+918210531230")));
        students.add(new Student(10, "Krishna", "Patel", "Male", "Electronics Engineering", "Karnataka", 148, Arrays.asList("+917241262389", "+918247291263")));
        students.add(new Student(11, "Arjun", "Kumar", "Female", "Biotech Engineering", "Delhi", 111, Arrays.asList("+919331804514")));
        students.add(new Student(12, "Vivaan", "Jain", "Female", "Instrumentation Engineering", "Mumbai", 95, Arrays.asList("+916845477183", "+916788662832")));
        students.add(new Student(13, "Vivaan", "Gupta", "Female", "Biotech Engineering", "Pune", 167, Arrays.asList("+919573887732")));
        students.add(new Student(14, "Muhammad", "Singh", "Male", "Computer Engineering", null, 19, Arrays.asList("+916603655559", "+917692964840")));
        students.add(new Student(15, "Sai", "Patel", "Female", "Mechanical Engineering", "Pune", 122, Arrays.asList("+918638951955", "+919570068872")));
        students.add(new Student(16, "Reyansh", "Singh", "Female", "Computer Engineering", "Karnataka", 12, Arrays.asList("+919769837742")));
        students.add(new Student(17, "Sai", "Verma", "Female", "Mechanical Engineering", "Pune", 233, Arrays.asList("+919451553837")));
        students.add(new Student(18, "Reyansh", "Das", "Female", "Instrumentation Engineering", "Pune", 268, Arrays.asList("+916246521203")));
        students.add(new Student(19, "Aditya", "Jain", "Female", "Computer Engineering", "Karnataka", 290, Arrays.asList("+917704452221", "+918895554581", "+919893002827")));
        students.add(new Student(20, "Krishna", "Gupta", "Female", "Electronics Engineering", "", 145, Arrays.asList("+918305519992")));

        return students;
    }
}
