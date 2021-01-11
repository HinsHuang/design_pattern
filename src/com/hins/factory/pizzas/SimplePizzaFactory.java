package com.hins.factory.pizzas;

public class SimplePizzaFactory {

    public Pizza createPizza(PizzaEnum type) {
        Pizza pizza = null;
        switch (type) {
            case CHEESE:
                pizza = new CheesePizza();
                break;
            case CLAM:
                pizza = new ClamPizza();
                break;
            case VEGGIE:
                pizza = new VeggiePizza();
                break;
            case PEPPERONI:
                pizza = new PepperoniPizza();
                break;
            default:
                break;
        }
        return pizza;
    }
}
