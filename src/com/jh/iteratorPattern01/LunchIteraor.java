package com.jh.iteratorPattern01;

import java.util.ArrayList;

public class LunchIteraor implements Iterator {
	
	ArrayList<MenuItem> menuItems;
	
	int position = 0;
	
	public LunchIteraor(ArrayList<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}

	@Override
	public boolean hasNext() {
		if (position >= menuItems.size()) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public MenuItem next() {
		MenuItem item = menuItems.get(position);
		position = position + 1;
		return null;
	}

}
