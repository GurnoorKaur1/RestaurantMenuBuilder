package RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.menus_main;

import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.menu_building.ConcreteMenuBuilding;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.menus.RestaurantMenu;

/**
 * MenuFactoryTest is a class that tests the functionality of the 
 * restaurant menu building process for different seasons.
 * It uses the ConcreteMenuBuilding class to create and populate
 * seasonal restaurant menus.
 * 
 * @author gouraya
 */
public class MenuFactoryTest {

    /**
     * The main method that serves as the entry point for the program.
     * It creates seasonal menus and displays their contents.
     * 
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        
        ConcreteMenuBuilding theBuilding = new ConcreteMenuBuilding();
        
        // Create and populate the Fall menu
        RestaurantMenu theFallMenu = theBuilding.buildRestaurantMenu("Fall"); 
        theFallMenu.populateMenu();
        System.out.println(theFallMenu);
        
        System.out.println("");
        
        // Create and populate the Winter menu
        RestaurantMenu theWinterMenu = theBuilding.buildRestaurantMenu("Winter");
        theWinterMenu.populateMenu(); 
        System.out.println(theWinterMenu);
        
        System.out.println("");
        
        // Create and populate the Spring menu
        RestaurantMenu theSpringMenu = theBuilding.buildRestaurantMenu("Spring");
        theSpringMenu.populateMenu();
        System.out.println(theSpringMenu);
         
        System.out.println("");
        
        // Create and populate the Summer menu
        RestaurantMenu theSummerMenu = theBuilding.buildRestaurantMenu("Summer");
        theSummerMenu.populateMenu();
        System.out.println(theSummerMenu);
    }    
}
