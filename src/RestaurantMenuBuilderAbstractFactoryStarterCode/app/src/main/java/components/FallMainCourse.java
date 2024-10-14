/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components;

/**
 * Class representing a specific type of main course for fall.
 * This class implements the MainCourse interface and provides
 * a string representation of fall-themed main courses.
 * 
 * @author Gurnoor Kaur
 */
public class FallMainCourse implements MainCourse {
    
    /**
     * Returns a string representation of the fall main courses.
     *
     * @return a string listing the fall main courses: Salmon Avocado Toast,
     *         Pesto Chicken Penne Asiago, and Portobello Mushroom Chicken.
     */
    @Override
    public String toString() {
        return "Salmon Avocado Toast\n" +
               "Pesto Chicken Penne Asiago\n" +
               "Portobello Mushroom Chicken";
    }
}
