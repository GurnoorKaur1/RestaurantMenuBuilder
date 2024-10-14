/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components;

/**
 * Class representing a specific type of main course for summer.
 * This class implements the MainCourse interface and provides
 * a string representation of summer-themed main courses.
 * 
 * @author Gurnoor Kaur
 */
public class SummerMainCourse implements MainCourse {

    /**
     * Returns a string representation of the summer main courses.
     *
     * @return a string listing the summer main courses: Beef Tartare,
     *         Spiced Cauliflower, and Chinook Salmon.
     */
    @Override
    public String toString() {
        return "Beef Tartare\n" +
               "Spiced Cauliflower\n" +
               "Chinook Salmon";
    }
}
