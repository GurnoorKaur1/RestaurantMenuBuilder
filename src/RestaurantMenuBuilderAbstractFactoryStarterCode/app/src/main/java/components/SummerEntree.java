/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components;

/**
 * Class representing a specific type of entree for summer.
 * This class implements the Entree interface and provides
 * a string representation of summer-themed entrees.
 * 
 * @author Gurnoor Kaur
 */
public class SummerEntree implements Entree {
    
    /**
     * Returns a string representation of the summer entrees.
     *
     * @return a string listing the summer entrees: Avocado Scramble,
     *         Little Gem Salad, and Miso Cauliflower Soup.
     */
    @Override
    public String toString() {
        return "Avocado scramble\n" +
               "Little Gem Salad\n" +
               "Miso Cauliflower Soup";
    }
}
