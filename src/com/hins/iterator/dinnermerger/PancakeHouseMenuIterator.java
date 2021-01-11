package com.hins.iterator.dinnermerger;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {

    private ArrayList<MenuItem> menuItems;
    private int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position >= menuItems.size() ? false : true;
    }

    @Override
    public MenuItem next() {
        return menuItems.get(position++);
    }
}
