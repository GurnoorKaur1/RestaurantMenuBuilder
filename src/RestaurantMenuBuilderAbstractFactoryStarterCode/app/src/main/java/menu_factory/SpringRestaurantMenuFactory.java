/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.menu_factory;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.Dessert;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.Drink;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.Entree;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.MainCourse;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.SpringDessert;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.SpringDrink;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.SpringEntree;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.SpringMainCourse;
/**
 *
 * @author gouraya
 */
public class SpringRestaurantMenuFactory implements RestaurantMenuFactory {

	@Override
    public Drink createDrink() {
        return new SpringDrink();
    }
    
    @Override
    public MainCourse createMainCourse() {
        return new SpringMainCourse();
    }

    @Override
    public Entree createEntree() {
        return new SpringEntree();
    }

    @Override
    public Dessert createDessert() {
        return new SpringDessert();
    }   
}
