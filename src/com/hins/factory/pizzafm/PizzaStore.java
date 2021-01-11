package com.hins.factory.pizzafm;

public abstract class PizzaStore {

    abstract Pizza createPizza(PizzaEnum style);

    public Pizza orderPizza(PizzaEnum style) {
        Pizza pizza = createPizza(style);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
