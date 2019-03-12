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
public class ChickenPizza implements Pizza{

    @Override
    public void getPizza() {
        System.out.println("Chicken Pizza is Selected");
        
    }

    @Override
    public void getCost() {
        System.out.println("Chicken Pizza Price is Displayed");
    }
    
}
