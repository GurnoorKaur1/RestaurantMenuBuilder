/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components;

/**
 * Class representing a specific type of main course for winter.
 * This class implements the MainCourse interface and provides
 * a string representation of winter-themed main courses.
 * 
 * @author Gurnoor Kaur
 */
public class WinterMainCourse implements MainCourse {
    
    /**
     * Returns a string representation of the winter main courses.
     *
     * @return a string listing the winter main courses: Sirloin,
     *         Salmon Croquettes, and Steak and Fries.
     */
    @Override
    public String toString() {
        return "Sirloin\n" +
               "Salmon Croquettes\n" +
               "Steak and Fries";
    }
}
