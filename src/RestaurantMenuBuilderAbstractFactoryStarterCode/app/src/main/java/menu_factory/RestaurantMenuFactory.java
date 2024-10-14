package RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.menu_factory;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.Dessert;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.Drink;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.MainCourse;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.Entree;

/**
 * Interface for the restaurant menu factory that defines methods for creating
 * various components of a seasonal restaurant menu.
 * Implementing classes will provide specific menu items based on the season.
 * 
 * @author Gurnoor Kaur
 */
public interface RestaurantMenuFactory {
    
    /**
     * Creates a drink for the menu.
     *
     * @return a Drink instance.
     */
    public Drink createDrink();

    /**
     * Creates a main course for the menu.
     *
     * @return a MainCourse instance.
     */
    public MainCourse createMainCourse();

    /**
     * Creates an entree for the menu.
     *
     * @return an Entree instance.
     */
    public Entree createEntree();

    /**
     * Creates a dessert for the menu.
     *
     * @return a Dessert instance.
     */
    public Dessert createDessert();
}
