package com.jh.decoratePattern01.servlet;

import com.jh.decoratePattern01.OrderDatas;
import com.jh.decoratePattern01.StarbuckStore;
import com.jh.common.LogicClass;

public class LogicStarbuckClass extends LogicClass {
  
  public LogicStarbuckClass() {
    // TODO Auto-generated constructor stub
    super();
  }

  @Override
  public void run(Object o) {
    // TODO Auto-generated method stub
    new StarbuckStore().orderCoffee((OrderDatas) o);
    
  }

}
