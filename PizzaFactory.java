/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpat.abstractfactory;

/**
 *
 * @author hp
 */
public class PizzaFactory extends AbstractFactory{


    public Pizza getPizza(String pizzatype) {
        if(pizzatype.equalsIgnoreCase("CheesePizza"))
            return new CheesePizza();
        else if (pizzatype.equalsIgnoreCase("VegePizza"))
            return new VegePizza();
        else if (pizzatype.equalsIgnoreCase("ChickenPizza"))
            return new ChickenPizza();
        return null;
        
    }

    @Override
    Toppings getToppings(String Topping) {
        return null;
        
    }
    
   

   
}
