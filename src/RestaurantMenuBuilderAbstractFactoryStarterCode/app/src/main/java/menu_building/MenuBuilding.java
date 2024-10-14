/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.menu_building;

import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.menus.RestaurantMenu;

/**
 * Abstract class that defines the structure for building restaurant menus.
 * Subclasses must implement the method to create a menu for a specific season.
 * 
 * @author Gurnoor Kaur
 */
public abstract class MenuBuilding {

    /**
     * Abstract method to create a RestaurantMenu based on the specified season.
     *
     * @param season the season for which the menu is to be created.
     *               It can be "Fall", "Winter", "Spring", or "Summer".
     * @return the constructed RestaurantMenu for the specified season.
     */
    protected abstract RestaurantMenu makeMenuBuilding(String season);

    /**
     * Builds a RestaurantMenu for the specified season, populating it with items.
     *
     * @param season the season for which the menu is to be built.
     * @return the populated RestaurantMenu.
     */
    public RestaurantMenu buildRestaurantMenu(String season) {
        RestaurantMenu theMenu = makeMenuBuilding(season);
        theMenu.populateMenu();
        return theMenu;
    }
    
}
