package RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.menus;

import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.menu_factory.RestaurantMenuFactory;

/**
 * FallRestaurantMenu represents the implementation of the restaurant menu 
 * specifically for the fall season. It utilizes the RestaurantMenuFactory 
 * to create various menu items like entrees, main courses, desserts, 
 * and drinks.
 * 
 * This class is responsible for populating the fall menu with seasonal 
 * items provided by the specified factory.
 */
public class FallRestaurantMenu extends RestaurantMenu {
    
    RestaurantMenuFactory theFactory;
    
    /**
     * Constructs a FallRestaurantMenu with the specified menu factory.
     * 
     * @param factory the RestaurantMenuFactory used to create menu items
     */
    public FallRestaurantMenu(RestaurantMenuFactory factory) {
        this.theFactory = factory;
    }
    
    /**
     * Populates the menu with items specific to the fall season by 
     * utilizing the factory to create the various components of the menu.
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
