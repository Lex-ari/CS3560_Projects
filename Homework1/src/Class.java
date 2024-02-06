/*
    Author: Alex Mariano
    Dr. Dave Johannsen
    CS 3560 Object Oriented Design and Programming
 */

import java.sql.Time;
import java.util.List;

/**
 * Class class that holdes instructor, time, prerequisites, lecturehall, and students
 */
public class Class {
    private String name;
    private Instructor instructor;
    private List<Class> prerequisites;
    private Time time;
    private LectureHall lectureHall;
    private List<Student> listOfStudents;

    /**
     * This constructs a new Class
     * @param name  Name of the class
     * @param time  Time for the class
     */
    public Class(String name, Time time){

    }

    /**
     * Adds an instructor to the Class. Will replace current instructor.
     * @param instructor    Instructor to add
     */
    public void addInstructor(Instructor instructor){

    }

    /**
     * Remove current instructor and leave the spot empty.
     */
    public void removeInstructor(){

    }

    /**
     * Adds a Class to the list of prerequisites for this Class object.
     * @param prerequisiteClass Class to add to list of prerequisites.
     */
    public void addPrerequisiteClass(Class prerequisiteClass){

    }

    /**
     * Removes a Class from the list of prerequisites for this Class object.
     * @param prerequisiteClass Class to remove from list of prerequisites.
     */
    public void removePrerequisiteClass(Class prerequisiteClass){

    }

    /**
     * Generates a Roster containing information including
     * Instructor, Time, LectureHall, and List of Students.
     * @return A Roaster in the form of a String, containing Class info.
     */
    public String generateRoster(){
        return null;
    }

    /**
     * Adds a student to list of Students
     * @param student   Student to add to list of students
     */
    public void addStudent(Student student){

    }

    /**
     * Removes a student from list of students.
     * @param student   Student to remove from list of students.
     */
    public void removeStudent(Student student){

    }

}
