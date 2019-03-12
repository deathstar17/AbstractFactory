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
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        
        if(choice.equalsIgnoreCase("ToppingsFactory")){
            return new ToppingsFactory();}
        else if(choice.equalsIgnoreCase("PizzaFactory")){
            return new PizzaFactory();}
        return null;
           
        
    }
            
          
    
}
