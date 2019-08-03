package com.jh.iteratorPattern01;

public class Breakfast implements Menu {
	MenuItem[] menuItems;
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	int position = 0;
	
	public Breakfast() {
		menuItems = new MenuItem[MAX_ITEMS];
		addItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
		addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
		addItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29);
		addItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05);
		addItem("Steamed Veggies and Brown Rice", "Steamed vegetables over brown rice", true, 3.99);
		addItem("Pasta", "Spaghetti with Marinara Sauce, and a slice of sourdough bread", true, 3.89);
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		
		menuItems[numberOfItems] = menuItem;
		numberOfItems = numberOfItems + 1;
	}

	public void setMenuItems(MenuItem[] menuItems) {
		this.menuItems = menuItems;
	}

	public MenuItem[] getMenuItems() {
		return menuItems;
	}

	@Override
	public Iterator createIterator() {
		return new BreakfastIterator(menuItems);
	}
}
