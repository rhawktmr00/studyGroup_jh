package com.jh.decoratePattern01;

import java.util.List;

public class StarbuckStore {

  public void orderCoffee(OrderDatas orderData) {

    String coffee = orderData.getCoffee();
        
        if (coffee.equals("Espresso")) {
          
        } else if (coffee.equals("HouseBlend")) {
          
        }
        
        if(orderData.getToppings() != null) {
          
          List<String> toppings = orderData.getToppings();
          for (String topping : toppings) {
              if (topping.equals("Soy")) {
                
              } else if (topping.equals("Whip")) {
                
              } else if (topping.equals("Mocha")) {
                
              }
          }
        }
        
      }
}
