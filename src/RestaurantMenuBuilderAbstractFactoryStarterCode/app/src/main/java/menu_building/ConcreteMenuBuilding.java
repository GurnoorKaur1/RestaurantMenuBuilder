/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.menu_building;

import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.menu_factory.FallRestaurantMenuFactory;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.menu_factory.SpringRestaurantMenuFactory;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.menu_factory.SummerRestaurantMenuFactory;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.menu_factory.WinterRestaurantMenuFactory;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.menus.FallRestaurantMenu;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.menus.RestaurantMenu;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.menus.SpringRestaurantMenu;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.menus.SummerRestaurantMenu;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.menus.WinterRestaurantMenu;

/**
 * Concrete implementation of the MenuBuilding class.
 * This class is responsible for creating different types of restaurant menus
 * based on the specified season.
 * 
 * @author Gurnoor Kaur
 */
public class ConcreteMenuBuilding extends MenuBuilding {
    
    /**
     * Creates a RestaurantMenu based on the provided season.
     *
     * @param season the season for which the menu is to be created.
     *               It can be "Fall", "Winter", "Spring", or "Summer".
     * @return the constructed RestaurantMenu for the specified season,
     *         or null if the season is unrecognized.
     */
    @Override
    protected RestaurantMenu makeMenuBuilding(String season) {
        RestaurantMenu theMenu = null;
        if ("Fall".equalsIgnoreCase(season)) {
            FallRestaurantMenuFactory theFactory = new FallRestaurantMenuFactory();
            theMenu = new FallRestaurantMenu(theFactory);
            theMenu.setName("Fall Menu");
            theMenu.setPeriod("September 1 to November 30.");
        }
        else if ("Winter".equalsIgnoreCase(season)) {
            WinterRestaurantMenuFactory theFactory = new WinterRestaurantMenuFactory();
            theMenu = new WinterRestaurantMenu(theFactory);
            theMenu.setName("Winter Menu"); 
            theMenu.setPeriod("December 1 to February 28.");
        }
        else if ("Spring".equalsIgnoreCase(season)) {
            SpringRestaurantMenuFactory theFactory = new SpringRestaurantMenuFactory();
            theMenu = new SpringRestaurantMenu(theFactory);
            theMenu.setName("Spring Menu");
            theMenu.setPeriod("March 1 to May 30.");
        }
        else if ("Summer".equalsIgnoreCase(season)) {
            SummerRestaurantMenuFactory theFactory = new SummerRestaurantMenuFactory();
            theMenu = new SummerRestaurantMenu(theFactory);
            theMenu.setName("Summer Menu");
            theMenu.setPeriod("June 1 to August 31");
        }
        return theMenu;
    }
}
