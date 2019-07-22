package com.jh.common;

public class SystemOut {

  static LogicClass lc ;
  
  public void addClass(LogicClass lc) {
      SystemOut.lc = lc;
  }
  
  protected void print(String s) {
      
      lc.systemOutPrint(s);
  }
  
}
