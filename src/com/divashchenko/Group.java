package com.divashchenko;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Group {
    private String nameOfCourse;
    private LocalDate startDateOfCourse;
    private int numberOfLessons;
    private int numberOfLessonsInWeek;
    private List<Person> students = new ArrayList<>();

    //==================================================

    public Group(String nameOfCourse, LocalDate startDateOfCourse, int numberOfLessons, int numberOfLessonsInWeek) {
        this.nameOfCourse = nameOfCourse;
        this.startDateOfCourse = startDateOfCourse;
        this.numberOfLessons = numberOfLessons;
        this.numberOfLessonsInWeek = numberOfLessonsInWeek;
    }

    //==================================================


    public String getNameOfCourse() {
        return nameOfCourse;
    }

    public LocalDate getStartDateOfCourse() {
        return startDateOfCourse;
    }

    public int getNumberOfLessons() {
        return numberOfLessons;
    }

    public int getNumberOfLessonsInWeek() {
        return numberOfLessonsInWeek;
    }

    public List<Person> getStudents() {
        return students;
    }

    //===================================================

    public void setStudents(List<Person> students) {
        this.students = students;
    }
}
