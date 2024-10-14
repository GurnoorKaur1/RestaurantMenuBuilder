/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.menus_main;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.menu_building.ConcreteMenuBuilding;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.menus.RestaurantMenu;

/**
 *
 * @author gouraya
 */
public class MenuFactoryTest {

public static void main(String[] args) {
        
        ConcreteMenuBuilding theBuilding = new ConcreteMenuBuilding();
        
        RestaurantMenu theFallMenu = theBuilding.buildRestaurantMenu("Fall"); 
        theFallMenu.populateMenu();
        System.out.println(theFallMenu);
        
        System.out.println("");
        
        RestaurantMenu theWinterMenu = theBuilding.buildRestaurantMenu("Winter");
        theWinterMenu.populateMenu(); 
        System.out.println(theWinterMenu);
        
        System.out.println("");
        
        RestaurantMenu theSpringMenu = theBuilding.buildRestaurantMenu("Spring");
        theSpringMenu.populateMenu();
        System.out.println(theSpringMenu );
         
        System.out.println("");
        
        RestaurantMenu theSummerMenu = theBuilding.buildRestaurantMenu("Summer");
        theSummerMenu.populateMenu();
        System.out.println(theSummerMenu);
        
    }    
}
