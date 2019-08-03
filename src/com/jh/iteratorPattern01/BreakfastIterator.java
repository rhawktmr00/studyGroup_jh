package com.jh.iteratorPattern01;

public class BreakfastIterator implements Iterator {

	MenuItem[] menuItems;
	int position = 0;

	public BreakfastIterator(MenuItem[] menuItems) {
		this.menuItems = menuItems;
  }

	@Override
	public boolean hasNext() {
		if (position >= menuItems.length || menuItems[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public MenuItem next() {
		MenuItem menuItem = menuItems[position];
		position = position + 1;
		return menuItem;
	}

}
