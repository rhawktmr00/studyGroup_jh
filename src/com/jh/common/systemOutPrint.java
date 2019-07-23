package com.jh.common;

public class systemOutPrint extends SystemOut{
  
    public systemOutPrint(String s) {
        // TODO Auto-generated constructor stub
        print(s);
    }

    public systemOutPrint(float s) {
        // TODO Auto-generated constructor stub
	s = Math.round(s*100)/100;
        String ss = String.valueOf(s);
        print(ss);
    }

    public systemOutPrint(double s) {
        // TODO Auto-generated constructor stub
    	s = Math.floor(s*100)/100.0;
        String ss = String.valueOf(s);
        print(ss);
    }

    public systemOutPrint(int s) {
      String ss = String.valueOf(s);
      print(ss);
    }
}
