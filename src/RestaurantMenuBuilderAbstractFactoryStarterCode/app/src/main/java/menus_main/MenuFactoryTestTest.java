package RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.menus_main;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.FallDessert;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.FallDrink;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.FallEntree;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.FallMainCourse;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.SpringDessert;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.SpringDrink;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.SpringEntree;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.SpringMainCourse;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.SummerDessert;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.SummerDrink;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.SummerEntree;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.SummerMainCourse;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.WinterDessert;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.WinterDrink;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.WinterEntree;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.WinterMainCourse;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.menu_factory.FallRestaurantMenuFactory;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.menu_factory.SpringRestaurantMenuFactory;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.menu_factory.SummerRestaurantMenuFactory;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.menu_factory.WinterRestaurantMenuFactory;

public class MenuFactoryTestTest {

    @Test
    public void testFallRestaurantMenuFactory() {
        FallRestaurantMenuFactory factory = new FallRestaurantMenuFactory();

        assertTrue(factory.createEntree() instanceof FallEntree);
        assertTrue(factory.createMainCourse() instanceof FallMainCourse);
        assertTrue(factory.createDessert() instanceof FallDessert);
        assertTrue(factory.createDrink() instanceof FallDrink);
    }

    @Test
    public void testWinterRestaurantMenuFactory() {
        WinterRestaurantMenuFactory factory = new WinterRestaurantMenuFactory();

        assertTrue(factory.createEntree() instanceof WinterEntree);
        assertTrue(factory.createMainCourse() instanceof WinterMainCourse);
        assertTrue(factory.createDessert() instanceof WinterDessert);
        assertTrue(factory.createDrink() instanceof WinterDrink);
    }

    @Test
    public void testSpringRestaurantMenuFactory() {
        SpringRestaurantMenuFactory factory = new SpringRestaurantMenuFactory();

        assertTrue(factory.createEntree() instanceof SpringEntree);
        assertTrue(factory.createMainCourse() instanceof SpringMainCourse);
        assertTrue(factory.createDessert() instanceof SpringDessert);
        assertTrue(factory.createDrink() instanceof SpringDrink);
    }

    @Test
    public void testSummerRestaurantMenuFactory() {
        SummerRestaurantMenuFactory factory = new SummerRestaurantMenuFactory();

        assertTrue(factory.createEntree() instanceof SummerEntree);
        assertTrue(factory.createMainCourse() instanceof SummerMainCourse);
        assertTrue(factory.createDessert() instanceof SummerDessert);
        assertTrue(factory.createDrink() instanceof SummerDrink);
    }
}

