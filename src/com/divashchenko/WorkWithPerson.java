package com.divashchenko;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class WorkWithPerson {
    public static String fullName(Person person) {
        return person.getLastName() + " " + person.getFirstName() + " " + person.getSecondName();
    }

    public static String shortFullName(Person person) {
        return person.getLastName() + " " + person.getFirstName().charAt(0) + ". " + person.getSecondName().charAt(0) + ".";
    }

    public static int howOld(Person person) {
        if (person.getBirthdayDate() == null) {
            return 0;
        }
        return Period.between(person.getBirthdayDate(), LocalDate.now()).getYears();
    }

    public static void addGroupToPerson(Person person, Group group) {
        List<Group> tmpPerson = person.getGroupWithPerson();
        tmpPerson.add(group);
        person.setGroupWithPerson(tmpPerson);
    }

    public static void delGroupFromPerson(Person person, Group group) {
        List<Group> tmpPerson = person.getGroupWithPerson();
        tmpPerson.remove(group);
        person.setGroupWithPerson(tmpPerson);
    }

    public static void showPersonsGroups(Person person) {
        for (int i = 0; i < person.getGroupWithPerson().size(); i++) {
            System.out.println(WorkWithGroup.howIsGroupName(person.getGroupWithPerson().get(i)) + " ");
        }
        if (person.getGroupWithPerson().size() < 1) {
            System.out.println("Student isn't in a group!");
        }
    }
}
