/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.menu_factory;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.Dessert;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.Drink;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.MainCourse;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.Entree;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.FallDessert;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.FallDrink;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.FallEntree;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.FallMainCourse;

/**
 *
 * @author gouraya
 */
public class FallRestaurantMenuFactory implements RestaurantMenuFactory {

	   @Override
	    public Drink createDrink() {
	        return new FallDrink();
	    }
	    
	    @Override
	    public MainCourse createMainCourse() {
	        return new FallMainCourse();
	    }

	    @Override
	    public Entree createEntree() {
	        return new FallEntree();
	    }

	    @Override
	    public Dessert createDessert() {
	        return new FallDessert();
	    }    
	}   

