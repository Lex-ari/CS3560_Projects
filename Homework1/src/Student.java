/*
    Author: Alex Mariano
    Dr. Dave Johannsen
    CS 3560 Object Oriented Design and Programming
 */

import java.util.List;

/**
 * Student class that holds a name, id, list of classes, and list of
 * grades for the student.
 */
public class Student {
    private List<Class> listOfClasses;
    private String name;
    private int idNumber;
    private List<Grade> listOfGrades;

    /**
     * This constructs a new Student object with set information.
     * @param name  Name of student
     * @param idNumber  integer ID number of student
     */
    public Student(String name, int idNumber){

    }

    /**
     * This adds a class to student's list of classes
     * @param newClass  class to add to list of classes
     */
    public void addClass(Class newClass){

    }

    /**
     * This removes a class from student's list of classes.
     * @param removeClass   Class to remove from list of classes.
     */
    public void removeClass(Class removeClass){

    }

    /**
     * Generates a schedule containing the times of each class
     * from list of classes.
     * @return A string containing times of list of classes.
     */
    public String generateSchedule(){
        return null;
    }

    /**
     * Generates a report card containing each letter grade
     * student has received.
     * @return String containing all letter grades received.
     */
    public String generateReportCard(){
        return null;
    }

    /**
     * This adds a Grade to student's list of Grades.
     * @param grade Grade to add to list of Grades.
     */
    public void assignGrade(Grade grade){

    }

    /**
     * Gets the student name
     * @return  String of student name;
     */
    public String getName(){
        return null;
    }

    /**
     * Gets the student ID number
     * @return  Int of student ID number
     */
    public int getIdNumber(){
        return idNumber;
    }
}
