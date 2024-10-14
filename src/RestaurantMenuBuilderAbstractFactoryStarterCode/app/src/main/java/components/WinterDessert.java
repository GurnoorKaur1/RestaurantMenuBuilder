/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components;

/**
 * Class representing a specific type of dessert for winter.
 * This class implements the Dessert interface and provides
 * a string representation of winter-themed desserts.
 * 
 * @author Gurnoor Kaur
 */
public class WinterDessert implements Dessert {
    
    /**
     * Returns a string representation of the winter desserts.
     *
     * @return a string listing the winter desserts: Chocolate Mousse,
     *         Caramel Cheesecake, and Chocolate Sponge Cake.
     */
    @Override
    public String toString() {
        return "Chocolate Mousse\n" +
               "Caramel Cheesecake\n" +
               "Chocolate Sponge Cake";
    }
}
