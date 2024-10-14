/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.menu_building;

import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.menus.RestaurantMenu;

/**
 *
 * @author gouraya
 */

public abstract class MenuBuilding {

    protected abstract RestaurantMenu makeMenuBuilding(String season);

    public RestaurantMenu buildRestaurantMenu(String season) {
        RestaurantMenu theMenu = makeMenuBuilding(season);
        theMenu.populateMenu();
        return theMenu;
    }
    
}