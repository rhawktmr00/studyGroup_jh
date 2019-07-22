package com.jh.decoratePattern01;

import java.util.List;
import com.jh.common.ReturnType;

public class OrderDatas implements ReturnType {

  private String coffee;
  private List<String> toppings;


  public String getCoffee() {
    return coffee;
  }

  public void setCoffee(String coffee) {
    this.coffee = coffee;
  }

  public List<String> getToppings() {
    return toppings;
  }

  public void setToppings(List<String> toppings) {
    this.toppings = toppings;
  }

}
