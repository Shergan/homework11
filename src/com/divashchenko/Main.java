package com.divashchenko;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Anna", "Denisova", "Osipko", LocalDate.of(1990, 12, 24));
        Person person2 = new Person("Sergei", "Egorovich", "Tomnikov", LocalDate.of(1990, 12, 24));
        Person person3 = new Person("Ivan", "Ivanovich", "Ivanov", LocalDate.of(1990, 12, 24));
        Person personFull = new Person("Davian Daiv Davidovich");

        Group group1 = new Group("Java", LocalDate.of(2018, 10, 2), 16, 2);

        System.out.println("Full name person1: " + WorkWithPerson.fullName(person1));
        System.out.println("Short name perosn1: " + WorkWithPerson.shortFullName(person1));
        System.out.println("Age perosn1: " + WorkWithPerson.howOld(person1));

        System.out.println();

        System.out.println("Group name group1: " + WorkWithGroup.howIsGroupName(group1));
        System.out.println("When is last week group1: " + WorkWithGroup.whenIsLastWeekOfGroup(group1));
        WorkWithGroup.addStudentToGroup(person1, group1);
        WorkWithGroup.addStudentToGroup(person2, group1);
        WorkWithGroup.addStudentToGroup(person3, group1);
        WorkWithGroup.showStudents(group1);

        System.out.println();

        WorkWithGroup.delStudentInGroup("Tomnikov", group1);
        WorkWithGroup.showStudents(group1);

        System.out.println();

        WorkWithGroup.delStudentInGroup(1, group1);
        WorkWithGroup.showStudents(group1);

        System.out.println();

        WorkWithGroup.findStudent("Ivanov", group1);  //yes
        WorkWithGroup.findStudent("Osipko", group1);  //no

        System.out.println();

        System.out.println("Full name personFull: " + WorkWithPerson.fullName(personFull));
        System.out.println("Short name personFull: " + WorkWithPerson.shortFullName(personFull));
        System.out.println("Age personFull: " + WorkWithPerson.howOld(personFull));

        System.out.println();

        WorkWithPerson.showPersonsGroups(person1);  //java
        WorkWithPerson.showPersonsGroups(person3);  //no group
    }
}
