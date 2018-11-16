package com.divashchenko;

import java.util.List;

public class WorkWithGroup {
    public static String howIsGroupName(Group group) {
        return group.getNameOfCourse() + "-" + group.getStartDateOfCourse().getMonth() + "-" + group.getStartDateOfCourse().getYear();
    }

    public static String whenIsLastWeekOfGroup(Group group) {
        // TODO fix time (need first day of week)
        return group.getStartDateOfCourse().plusWeeks(group.getNumberOfLessons() / group.getNumberOfLessonsInWeek()).toString();
    }

    public static void showStudents(Group group) {
        for (int i = 0; i < group.getStudents().size(); i++) {
            System.out.println((i + 1) + ". " + WorkWithPerson.fullName(group.getStudents().get(i)));
        }
    }

    public static void addStudentToGroup(Person person, Group group) {
        //Group obj
        List<Person> tmpGroup = group.getStudents();
        tmpGroup.add(person);
        group.setStudents(tmpGroup);

        //Student obj
        WorkWithPerson.addGroupToPerson(person, group);
    }

    public static void findStudent(String lastName, Group group) {
        boolean answer = false;
        for (int i = 0; i < group.getStudents().size(); i++) {
            if (group.getStudents().get(i).getLastName().equals(lastName)) {
                answer = true;
                break;
            }
        }
        if (answer) {
            System.out.println("Yes!");
        } else {
            System.out.println("No!");
        }
    }

    public static void delStudentInGroup(String lastName, Group group) {
        boolean answer = false;
        for (int i = 0; i < group.getStudents().size(); i++) {
            if (group.getStudents().get(i).getLastName().equals(lastName)) {
                //Group obj
                List<Person> tmpGroup = group.getStudents();
                tmpGroup.remove(i);
                group.setStudents(tmpGroup);

                //Student obj
                WorkWithPerson.delGroupFromPerson(group.getStudents().get(i), group);

                answer = true;
                break;
            }
        }
        if (!answer) {
            System.out.println("ERROR! This person is not included in this group!");
        }
    }

    public static void delStudentInGroup(int number, Group group) {
        if (number > 0 && number <= group.getStudents().size()) {
            //Group obj
            List<Person> tmpGroup = group.getStudents();
            tmpGroup.remove(number - 1);
            group.setStudents(tmpGroup);

            //Student obj
            WorkWithPerson.delGroupFromPerson(group.getStudents().get(number - 1), group);
        } else {
            System.out.println("ERROR! Wrong number!");
        }
    }
}
