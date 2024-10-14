/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components;

/**
 * Class representing a specific type of drink for spring.
 * This class implements the Drink interface and provides
 * a string representation of spring-themed drinks.
 * 
 * @author Gurnoor Kaur
 */
public class SpringDrink implements Drink {

    /**
     * Returns a string representation of the spring drinks.
     *
     * @return a string listing the spring drinks: Cucumber Smash,
     *         Lime Juice, and Candy Apple Cider.
     */
    @Override
    public String toString() {
        return "Cucumber Smash\n" +
               "Lime Juice\n" +
               "Candy Apple Cider";
    }

}
