/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components;

/**
 * Class representing a specific type of drink for summer.
 * This class implements the Drink interface and provides
 * a string representation of summer-themed drinks.
 * 
 * @author Gurnoor Kaur
 */
public class SummerDrink implements Drink {

    /**
     * Returns a string representation of the summer drinks.
     *
     * @return a string listing the summer drinks: Lemonade,
     *         Sangria, and Rum Punch.
     */
    @Override
    public String toString() {
        return "Lemonade\n" +
               "Sangria\n" +
               "Rum Punch";
    }
 
}
