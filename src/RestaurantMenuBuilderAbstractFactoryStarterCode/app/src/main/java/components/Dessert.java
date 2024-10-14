/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components;

/**
 * Interface representing a Dessert component in the restaurant menu.
 * This interface defines the contract for all dessert types in the menu.
 * Implementing classes must provide a string representation of the dessert.
 * 
 * @author Gurnoor Kaur
 */
public interface Dessert {
    
    /**
     * Returns a string representation of the dessert.
     *
     * @return a string describing the dessert.
     */
    @Override
    public String toString();
}
