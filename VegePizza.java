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
public class VegePizza implements Pizza {

    @Override
    public void getPizza() {
        System.out.println("Vegeterian Pizza is Selected");
        
    }

    @Override
    public void getCost() {
        System.out.println("Vegetarian Pizza Price is displayed");
        
    }
    
}
