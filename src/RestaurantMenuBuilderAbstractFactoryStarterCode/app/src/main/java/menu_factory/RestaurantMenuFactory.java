package RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.menu_factory;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.Dessert;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.Drink;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.MainCourse;
import RestaurantMenuBuilderAbstractFactoryStarterCode.app.src.main.java.components.Entree;
/**
 *
 * @author gouraya
 */
public interface RestaurantMenuFactory {
    
    public Drink createDrink();
    public MainCourse createMainCourse();
    public Entree createEntree();
    public Dessert createDessert();
    
}
