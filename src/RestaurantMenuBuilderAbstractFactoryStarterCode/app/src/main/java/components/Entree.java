/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components;

/**
 * Interface representing an Entree component in the restaurant menu.
 * This interface defines the contract for all entree types in the menu.
 * Implementing classes must provide a string representation of the entree.
 * 
 * @author Gurnoor Kaur
 */
public interface Entree {
    
    /**
     * Returns a string representation of the entree.
     *
     * @return a string describing the entree.
     */
    @Override
    public String toString();
    
}
