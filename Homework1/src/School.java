/*
    Author: Alex Mariano
    Dr. Dave Johannsen
    CS 3560 Object Oriented Design and Programming
 */

import java.util.List;

/**
 * This is school object that contains all Classes, Instructors, Lecture Halls,
 * and Student Information.
 *
 * This should be used to hold list of Classes, Lecture Halls, Instructors,
 * and Students.
 */
public class School {
    private List<Class> listOfClasses;
    private List<LectureHall> listOfLectureHalls;
    private List<Instructor> listOfInstructors;
    private List<Student> listOfStudents;

    /**
     * Constructs a new school. It is empty.
     */
    public School(){

    }

    /**
     * Adds a class to the school's list of classes.
     * @param newClass class to add to list of classes.
     */
    public void addClass(Class newClass){

    }

    /**
     * Remove a class from the school's list of classes.
     * @param removeClass class to remove from list of classes.
     */
    public void removeClass(Class removeClass){

    }

    /**
     * Adds a lecture hall to the school's list of lecture halls.
     * @param lectureHall   LectureHall to add to list of LectureHalls
     */
    public void addLectureHall(LectureHall lectureHall){

    }

    /**
     * Removes a lecture hall from this school's list of lecture halls.
     * @param lectureHall   LectureHall to remove from list of LectureHalls.
     */
    public void removeLectureHall(LectureHall lectureHall){

    }

    /**
     * Adds an instructor to the school's list of instructors.
     * @param instructor    Instructor to add to list of instructors.
     */
    public void addInstructor(Instructor instructor){

    }

    /**
     * Removes an instructor from the school's list of instructors.
     * @param instructor    Instructor to remove from list of instructors.
     */
    public void removeInstructor(Instructor instructor){

    }

    /**
     * Adds a student to the school's list of students.
     * @param student   Student to add to list of students.
     */
    public void addStudent(Student student){

    }

    /**
     * Removes a student from the school's list of students.
     * @param student   Student to remove from list of students.
     */
    public void removeStudent(Student student){

    }

    /**
     * Generates a Course Catalog listing each of the classes, their
     * prerequisites, times and locations, and their instructors.
     * @return A String containing listing each of the classes, their
     * prerequisites, times and locations, and their instructors.
     */
    public String generateCourseCatalog(){
        return null;
    }

}
