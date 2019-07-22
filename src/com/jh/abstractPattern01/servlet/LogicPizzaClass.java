package com.jh.abstractPattern01.servlet;

import com.jh.abstractPattern01.PizzaStore;
import com.jh.common.LogicClass;

public class LogicPizzaClass extends LogicClass{
  
  public LogicPizzaClass() {
    super();
  }

  @Override
  public void run(Object o) {

      PizzaStore ps = new PizzaStore();
      ps.orderPizza((String) o);

  }
  
}
