package com.java8.factory;

import java.util.List;
import java.util.Objects;

public class Student {
    private int id;
    private String firstName;
    private String LastName;
    private String gender;
    private String department;
    private String city;
    private int rank;
    private List<String> contacts;

    public List<String> getContacts() {
        return contacts;
    }

    public void setContacts(List<String> contacts) {
        this.contacts = contacts;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && rank == student.rank && Objects.equals(firstName, student.firstName) && Objects.equals(LastName, student.LastName) && Objects.equals(gender, student.gender) && Objects.equals(department, student.department) && Objects.equals(city, student.city) && Objects.equals(contacts, student.contacts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, LastName, gender, department, city, rank, contacts);
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", city='" + city + '\'' +
                ", rank=" + rank +
                ", contacts=" + contacts +
                '}';
    }

    public Student(int id, String firstName, String lastName, String gender, String department, String city, int rank, List<String> contacts) {
        this.id = id;
        this.firstName = firstName;
        LastName = lastName;
        this.gender = gender;
        this.department = department;
        this.city = city;
        this.rank = rank;
        this.contacts = contacts;
    }
}
