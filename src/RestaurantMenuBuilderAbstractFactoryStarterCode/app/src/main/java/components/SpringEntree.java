/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components;

/**
 * Class representing a specific type of entree for spring.
 * This class implements the Entree interface and provides
 * a string representation of spring-themed entrees.
 * 
 * @author Gurnoor Kaur
 */
public class SpringEntree implements Entree {
    
    /**
     * Returns a string representation of the spring entrees.
     *
     * @return a string listing the spring entrees: Lobster Veracruzana,
     *         Organic Ocean Halibut, and Mushroom Soup.
     */
    @Override
    public String toString() {
        return "Lobster Veracruzana\n" +
               "Organic Ocean Halibut\n" +
               "Mushroom Soup";
    }
}
