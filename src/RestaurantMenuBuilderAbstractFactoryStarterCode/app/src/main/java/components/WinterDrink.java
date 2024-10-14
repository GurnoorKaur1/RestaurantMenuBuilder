/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components;

/**
 * Class representing a specific type of drink for winter.
 * This class implements the Drink interface and provides
 * a string representation of winter-themed drinks.
 * 
 * @author Gurnoor Kaur
 */
public class WinterDrink implements Drink  {
    
    /**
     * Returns a string representation of the winter drinks.
     *
     * @return a string listing the winter drinks: Mojito,
     *         Alcohol Free Wine, and Tequila.
     */
    @Override
    public String toString() {
        return "Mojito\n" +
               "Alcohol Free Wine\n" +
               "Tequila";
    }
}
