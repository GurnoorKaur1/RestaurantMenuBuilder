package RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.menus;

import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.menu_factory.RestaurantMenuFactory;

/**
 * Summer Menu implementation.
 * This class represents the Summer restaurant menu, providing 
 * functionality to populate the menu with seasonal items 
 * using a specified restaurant menu factory.
 */
public class SummerRestaurantMenu extends RestaurantMenu {
    
    private RestaurantMenuFactory theFactory; // Factory to create menu items
    
    /**
     * Constructor for SummerRestaurantMenu.
     * 
     * @param factory the restaurant menu factory used to create menu items
     */
    public SummerRestaurantMenu(RestaurantMenuFactory factory) {
        this.theFactory = factory;
    }
    
    /**
     * Populates the menu with items for the Summer season.
     * This method utilizes the factory to create and assign 
     * the entree, main course, dessert, and drink for the menu.
     */
    @Override
    public void populateMenu() {
        System.out.println("Adding items to " + getName());
        
        // Assign menu items created by the factory
        this.entree = theFactory.createEntree();
        this.mainCourse = theFactory.createMainCourse();
        this.dessert = theFactory.createDessert();
        this.drink = theFactory.createDrink();
    }
}
