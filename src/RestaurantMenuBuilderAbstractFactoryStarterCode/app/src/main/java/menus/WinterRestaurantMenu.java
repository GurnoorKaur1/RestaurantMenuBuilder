package RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.menus;

import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.menu_factory.RestaurantMenuFactory;

/**
 * Winter Menu implementation.
 * This class represents the Winter restaurant menu, providing 
 * functionality to populate the menu with seasonal items 
 * using a specified restaurant menu factory.
 */
public class WinterRestaurantMenu extends RestaurantMenu {
    
    private RestaurantMenuFactory theFactory; // Factory to create menu items
    
    /**
     * Constructor for WinterRestaurantMenu.
     * 
     * @param factory the restaurant menu factory used to create menu items
     */
    public WinterRestaurantMenu(RestaurantMenuFactory factory) {
        this.theFactory = factory;
    }
    
    /**
     * Populates the menu with items for the Winter season.
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
