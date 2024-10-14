/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components;

/**
 * Class representing a specific type of dessert for fall.
 * This class implements the Dessert interface and provides
 * a string representation of fall-themed desserts.
 * 
 * @author Gurnoor Kaur
 */
public class FallDessert implements Dessert {

    /**
     * Returns a string representation of the fall desserts.
     *
     * @return a string listing the fall desserts: Carrot Cake,
     *         White Chocolate Cheesecake, and Apple Pie.
     */
    @Override
    public String toString() {
        return  "Carrot Cake\n" +
                "White Chocolate Cheesecake\n" +
                "Apple Pie\n";
    }
}
