/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components;

/**
 * Interface representing a Drink component in the restaurant menu.
 * This interface defines the contract for all drink types in the menu.
 * Implementing classes must provide a string representation of the drink.
 * 
 * @author Gurnoor Kaur
 */
public interface Drink {
    
    /**
     * Returns a string representation of the drink.
     *
     * @return a string describing the drink.
     */
    @Override
    public String toString();
}
