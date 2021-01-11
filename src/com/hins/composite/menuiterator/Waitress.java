package com.hins.composite.menuiterator;

import java.util.Iterator;

public class Waitress {

    private MenuComponent allmenus;

    public Waitress(MenuComponent allmenus) {
        this.allmenus = allmenus;
    }

    public void printMenu() {
        allmenus.print();
    }

    public void printVegetatianMenu() {
        Iterator<MenuComponent> iterator = allmenus.createIterator();
        while (iterator.hasNext()) {
            MenuComponent component = iterator.next();
            try {
                if (component.isVegetarian()) {
                    component.print();
                }
            } catch (UnsupportedOperationException ex) { }
        }
    }
}
