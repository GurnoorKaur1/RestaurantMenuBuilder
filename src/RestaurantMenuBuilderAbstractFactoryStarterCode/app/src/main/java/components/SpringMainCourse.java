/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components;

/**
 * Class representing a specific type of main course for spring.
 * This class implements the MainCourse interface and provides
 * a string representation of spring-themed main courses.
 * 
 * @author Gurnoor Kaur
 */
public class SpringMainCourse implements MainCourse {
    
    /**
     * Returns a string representation of the spring main courses.
     *
     * @return a string listing the spring main courses: Sunny Rise Burger,
     *         California Spring Salad, and Crispy Chicken Sandwich.
     */
    @Override
    public String toString() {
        return "Sunny Rise Burger\n" +
               "California Spring Salad\n" +
               "Crispy Chicken Sandwich";
    }
    
}
