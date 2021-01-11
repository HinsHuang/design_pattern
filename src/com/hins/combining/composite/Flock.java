package com.hins.combining.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {

    private ArrayList<Quackable> quackables = new ArrayList<>();

    public void add(Quackable quackable) {
        quackables.add(quackable);
    }

    @Override
    public void quack() {
        Iterator iterator = quackables.iterator();
        while (iterator.hasNext()) {
            Quackable duck = (Quackable) iterator.next();
            duck.quack();
        }

    }
}
