package com.jh.common;

public class systemOutPrint extends SystemOut{
  
    public systemOutPrint(String s) {
        // TODO Auto-generated constructor stub
        print(s);
    }

    public systemOutPrint(float s) {
        // TODO Auto-generated constructor stub
        String ss = String.valueOf(s);
        print(ss);
    }

    public systemOutPrint(int s) {
      String ss = String.valueOf(s);
      print(ss);
    }
}
