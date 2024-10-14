/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components;

/**
 * Class representing a specific type of entree for fall.
 * This class implements the Entree interface and provides
 * a string representation of fall-themed entrees.
 * 
 * @author Gurnoor Kaur
 */
public class FallEntree implements Entree {

    /**
     * Returns a string representation of the fall entrees.
     *
     * @return a string listing the fall entrees: Spinach and Artichoke Dip,
     *         Sesame Soy Tuna Tartare, and Tuscan Bruschetta.
     */
    @Override
    public String toString() {
        return "Spinach and Artichoke Dip\n" +
               "Sesame Soy Tuna Tartare\n" +
               "Tuscan Bruschetta";
    }
    
}
