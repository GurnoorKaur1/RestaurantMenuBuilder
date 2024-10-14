/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components;

/**
 * Class representing a specific type of drink for fall.
 * This class implements the Drink interface and provides
 * a string representation of fall-themed drinks.
 * 
 * @author Gurnoor Kaur
 */
public class FallDrink implements Drink {

    /**
     * Returns a string representation of the fall drinks.
     *
     * @return a string listing the fall drinks: Margarita,
     *         Dark Rum, and Orange Juice.
     */
    @Override
    public String toString() {
        return "Margarita\n" +
               "Dark Rum\n" +
               "Orange Juice";
    }
}
