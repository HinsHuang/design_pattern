package com.hins.adapter.ducks;

import java.util.Random;

public class DuckAdapter implements Turkey {

    private Duck duck;
    private Random random;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
        random = new Random();
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        if (random.nextInt(5) == 3) {
            duck.fly();
        }
    }
}
