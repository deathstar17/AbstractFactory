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
public class DPATAbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AbstractFactory pizzafactory = FactoryProducer.getFactory("PizzaFactory");
        Pizza cheese1 = pizzafactory.getPizza("VegePizza");
        cheese1.getCost();
        cheese1.getPizza();
       
   
        
        AbstractFactory Toppingsfactory = FactoryProducer.getFactory("ToppingsFactory");
        Toppings t1 = Toppingsfactory.getToppings("addCheese");
        t1.getToppings();
        t1.getCost();
        }
       
    }
    

