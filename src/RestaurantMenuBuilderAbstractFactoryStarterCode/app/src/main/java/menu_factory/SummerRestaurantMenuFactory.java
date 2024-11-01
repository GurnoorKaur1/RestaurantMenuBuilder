/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.menu_factory;

import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.Dessert;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.Drink;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.MainCourse;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.SummerDessert;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.SummerDrink;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.SummerEntree;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.SummerMainCourse;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.Entree;

/**
 * SummerRestaurantMenuFactory is responsible for creating components of the 
 * summer menu, including drinks, entrees, main courses, and desserts. 
 * This factory follows the abstract factory design pattern to produce 
 * seasonal menu items.
 * 
 * @author Gurnoor Kaur
 */
public class SummerRestaurantMenuFactory implements RestaurantMenuFactory {
   
    @Override
    public Drink createDrink() {
        return new SummerDrink();
    }
    
    @Override
    public MainCourse createMainCourse() {
        return new SummerMainCourse();
    }

    @Override
    public Entree createEntree() {
        return new SummerEntree();
    }

    @Override
    public Dessert createDessert() {
        return new SummerDessert();
    } 
}
