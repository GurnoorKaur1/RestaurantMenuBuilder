/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components;

/**
 * Interface representing a Main Course component in the restaurant menu.
 * This interface defines the contract for all main course types in the menu.
 * Implementing classes must provide a string representation of the main course.
 * 
 * @author Gurnoor Kaur
 */
public interface MainCourse {

    /**
     * Returns a string representation of the main course.
     *
     * @return a string describing the main course.
     */
    @Override
    public String toString();  
}
