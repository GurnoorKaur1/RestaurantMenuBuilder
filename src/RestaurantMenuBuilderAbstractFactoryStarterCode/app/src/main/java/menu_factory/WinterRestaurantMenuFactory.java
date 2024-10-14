/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.menu_factory;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.Dessert;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.Drink;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.MainCourse;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.WinterDessert;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.WinterDrink;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.WinterEntree;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.WinterMainCourse;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.Entree;

/**
 *
 * @author gouraya
 */
public class WinterRestaurantMenuFactory implements RestaurantMenuFactory {
    
	@Override
    public Drink createDrink() {
        return new WinterDrink();
    }
    
    @Override
    public MainCourse createMainCourse() {
        return new WinterMainCourse();
    }

    @Override
    public Entree createEntree() {
        return new WinterEntree();
    }

    @Override
    public Dessert createDessert() {
        return new WinterDessert();
    }   

    
}
