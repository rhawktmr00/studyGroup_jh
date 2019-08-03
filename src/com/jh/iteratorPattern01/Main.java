package com.jh.iteratorPattern01;

import java.util.ArrayList;

public class Main {
	
	public static void Main(String[] args) {
		
		Breakfast breakfast = new Breakfast();
		Lunch lunch = new Lunch();
		
		MenuItem[] breakfastMenuItems = breakfast.getMenuItems();
		
		ArrayList<MenuItem> lunchMenuItems = lunch.getMenuItems();
		
//		for (MenuItem menuItem : breakfastMenuItems) {
//	     System.out.println("메뉴"+menuItem.getName());
//	     System.out.println("가격"+menuItem.getPrice());
//	 }
//		
//	 for (MenuItem menuItem : lunchMenuItems) {
//	     System.out.println("메뉴"+menuItem.getName());
//	     System.out.println("가격"+menuItem.getPrice());
//	 }
		
		
	}
}
