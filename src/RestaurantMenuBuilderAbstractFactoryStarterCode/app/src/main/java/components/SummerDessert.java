/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components;

/**
 * Class representing a specific type of dessert for summer.
 * This class implements the Dessert interface and provides
 * a string representation of summer-themed desserts.
 * 
 * @author Gurnoor Kaur
 */
public class SummerDessert implements Dessert {
    
    /**
     * Returns a string representation of the summer desserts.
     *
     * @return a string listing the summer desserts: Lime Pie,
     *         Ultimate Cookie, and Churro Ice Cream Sandwich.
     */
    @Override
    public String toString() {
        return "Lime Pie\n" +
               "Ultimate Cookie\n" +
               "Churro Ice Cream Sandwich";
    }
}
