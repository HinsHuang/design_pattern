package com.hins.iterator.dinnermerger;

public class DinnerMenuIterator implements Iterator {

    private MenuItem[] menuItems;
    private int position = 0;

    public DinnerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position < menuItems.length && menuItems[position] != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public MenuItem next() {
        return menuItems[position++];
    }
}
