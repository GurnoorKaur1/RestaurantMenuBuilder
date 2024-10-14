/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components;

/**
 * Class representing a specific type of dessert for spring.
 * This class implements the Dessert interface and provides
 * a string representation of spring-themed desserts.
 * 
 * @author Gurnoor Kaur
 */
public class SpringDessert implements Dessert {
   
    /**
     * Returns a string representation of the spring desserts.
     *
     * @return a string listing the spring desserts: Vanilla Crème Brûlée,
     *         White Chocolate Brownie, and Passion Fruit Fig Tart.
     */
    @Override
    public String toString() {
        return "Vanilla Crème Brûlée\n" +
               "White Chocolate Brownie\n" +
               "Passion Fruit Fig Tart";
    }
}
