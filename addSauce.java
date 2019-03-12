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
public class addSauce implements Toppings{

    @Override
    public void getToppings() {
        System.out.println("Extra Sauce is added as Toppings");
    }

    @Override
    public void getCost() {
        System.out.println("Extra Sauce Price is Displayed");
    }
    
}
