/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components;

/**
 * Class representing a specific type of entree for winter.
 * This class implements the Entree interface and provides
 * a string representation of winter-themed entrees.
 * 
 * @author Gurnoor Kaur
 */
public class WinterEntree implements Entree {
  
    /**
     * Returns a string representation of the winter entrees.
     *
     * @return a string listing the winter entrees: Sesame Soy Tartare,
     *         Boston Clam Chowder, and Thai Soup.
     */
    @Override
    public String toString() {
        return "Sesame Soy Tartare\n" +
               "Boston Clam Chowder\n" +
               "Thai Soup";
    }
}
