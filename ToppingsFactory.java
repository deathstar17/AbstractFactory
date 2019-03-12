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
public class ToppingsFactory extends AbstractFactory {

   

    @Override
    Toppings getToppings(String Topping) {
        if(Topping.equals("addCheese"))
            return new addCheese();
        else if (Topping.equals("addSauce"))
            return new addSauce();
        else if (Topping.equals("addVege"))
            return new addVege();
        return null;
    }
     @Override
    Pizza getPizza(String Pizza) {
        return null;
       
    }
    
}
