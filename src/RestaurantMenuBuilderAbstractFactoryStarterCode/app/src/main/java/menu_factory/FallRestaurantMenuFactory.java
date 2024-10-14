/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.menu_factory;

import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.Dessert;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.Drink;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.MainCourse;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.Entree;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.FallDessert;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.FallDrink;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.FallEntree;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.FallMainCourse;

/**
 * Factory class to create components for the Fall restaurant menu.
 * Implements the RestaurantMenuFactory interface to provide seasonal menu items.
 * 
 * @author Gurnoor Kaur
 */
public class FallRestaurantMenuFactory implements RestaurantMenuFactory {

    /**
     * Creates a Fall-specific drink.
     *
     * @return a Drink instance representing a Fall drink.
     */
    @Override
    public Drink createDrink() {
        return new FallDrink();
    }
    
    /**
     * Creates a Fall-specific main course.
     *
     * @return a MainCourse instance representing a Fall main course.
     */
    @Override
    public MainCourse createMainCourse() {
        return new FallMainCourse();
    }

    /**
     * Creates a Fall-specific entree.
     *
     * @return an Entree instance representing a Fall entree.
     */
    @Override
    public Entree createEntree() {
        return new FallEntree();
    }

    /**
     * Creates a Fall-specific dessert.
     *
     * @return a Dessert instance representing a Fall dessert.
     */
    @Override
    public Dessert createDessert() {
        return new FallDessert();
    }    
}
