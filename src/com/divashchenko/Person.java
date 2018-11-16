package com.divashchenko;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Person {
    private String firstName;
    private String secondName;
    private String lastName;
    private LocalDate birthdayDate;
    private List<Group> GroupWithPerson = new ArrayList<>();

    //==============================================

    public Person(String firstName, String secondName, String lastName, LocalDate birthdayDate) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.birthdayDate = birthdayDate;
    }

    public Person(String firstName, String secondName, String lastName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.birthdayDate = null;
    }

    public Person(String fullName) {
        String[] tmpStringArray = fullName.split(" ");
        this.lastName = tmpStringArray[0];
        this.firstName = tmpStringArray[1];
        this.secondName = tmpStringArray[2];
        this.birthdayDate = null;
    }

    //==============================================

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthdayDate() {
        return birthdayDate;
    }

    public List<Group> getGroupWithPerson() {
        return GroupWithPerson;
    }

    //===============================================

    public void setBirthdayDate(LocalDate birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public void setGroupWithPerson(List<Group> groupWithPerson) {
        GroupWithPerson = groupWithPerson;
    }
}
