package RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.menus;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.menu_factory.FallRestaurantMenuFactory;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.menu_factory.WinterRestaurantMenuFactory;

public class RestaurantMenuTest {

    @Test
    public void testFallRestaurantMenuPopulation() {
        FallRestaurantMenuFactory factory = new FallRestaurantMenuFactory();
        RestaurantMenu fallMenu = new FallRestaurantMenu(factory);
        fallMenu.setName("Fall Menu");
        fallMenu.setPeriod("September 1 to November 30.");
        fallMenu.populateMenu();

        assertNotNull(fallMenu.entree);
        assertNotNull(fallMenu.mainCourse);
        assertNotNull(fallMenu.dessert);
        assertNotNull(fallMenu.drink);
    }

    @Test
    public void testWinterRestaurantMenuPopulation() {
        WinterRestaurantMenuFactory factory = new WinterRestaurantMenuFactory();
        RestaurantMenu winterMenu = new WinterRestaurantMenu(factory);
        winterMenu.setName("Winter Menu");
        winterMenu.setPeriod("December 1 to February 28.");
        winterMenu.populateMenu();

        assertNotNull(winterMenu.entree);
        assertNotNull(winterMenu.mainCourse);
        assertNotNull(winterMenu.dessert);
        assertNotNull(winterMenu.drink);
    }

    // Add similar tests for Spring and Summer restaurant menus...
}

