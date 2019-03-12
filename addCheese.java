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
public class addCheese implements Toppings{

    @Override
    public void getToppings() {
        System.out.println("Extra Cheese Topping is Added as Toppings");
        
    }

    @Override
    public void getCost() {
        System.out.println("Extra Cheese Price is Added");
        
    }
    
}
