/*
    Author: Alex Mariano
    Dr. Dave Johannsen
    CS 3560 Object Oriented Design and Programming
 */

import java.util.List;

/**
 * Instructor class that holds a name, ID, and list of classes.
 */
public class Instructor {
    private String name;
    private int idNumber;
    private List<Class> listOfClasses;

    /**
     * Constructs a new Instructor
     * @param name  Name of instructor
     * @param idNumber  ID number of the instructor
     */
    public Instructor(String name, int idNumber){

    }

    /**
     * This generates a schedule containing the list of Classes for this
     * Instructor.
     * @return  A String schedule of all classes in listOfClasses.
     */
    public String generateSchedule(){
        return null;
    }

    /**
     * Adds a class to this Instructor Object's list of classes.
     * @param newClass  Class to add to list of classes.
     */
    public void addClass(Class newClass){

    }

    /**
     * Removes a class to this instructor object's list of classes.
     * @param removingClass Class to remove from list of classes.
     */
    public void removeClass(Class removingClass){

    }

}
