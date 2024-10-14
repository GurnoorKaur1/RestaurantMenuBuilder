package RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.menus;

import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.menu_factory.RestaurantMenuFactory;

/**
 * Fall Menu implementation.
 */
public class FallRestaurantMenu extends RestaurantMenu {
    
    RestaurantMenuFactory theFactory;
    
    public FallRestaurantMenu(RestaurantMenuFactory factory) {
        this.theFactory = factory;
    }
    
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
