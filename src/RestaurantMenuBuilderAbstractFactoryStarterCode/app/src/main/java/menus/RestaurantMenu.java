package RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.menus;

import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.Dessert;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.Drink;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.MainCourse;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.Entree;

/**
 * Abstract class representing a restaurant menu.
 */
public abstract class RestaurantMenu {
    
    private String name; // Menu name
    private String period; // Period during which the menu is active
    
    // Newly defined objects that represent the menu items.
    protected Entree entree;
    protected MainCourse mainCourse;
    protected Dessert dessert;
    protected Drink drink;

    // Getter for the menu name
    public String getName() {
        return name; // Return the menu name
    }
    
    // Setter for the menu name
    public void setName(String name) {
        this.name = name; // Set the menu name
    }
    
    // Getter for the menu period
    public String getPeriod() {
        return period; // Return the active period of the menu
    }
    
    // Setter for the menu period
    public void setPeriod(String p) {
        this.period = p; // Set the active period of the menu
    }
    
    // Abstract method to populate the menu
    public abstract void populateMenu();
    
    // Returns the menu contents as a formatted string
    @Override
    public String toString() {
        return "Menu: " + name + "\n" +
               "Active: " + period + "\n" +
               "Entrees: " + entree.toString() + "\n" +
               "Main Courses: " + mainCourse.toString() + "\n" +
               "Desserts: " + dessert.toString() + "\n" +
               "Drinks: " + drink.toString();
    }
}
