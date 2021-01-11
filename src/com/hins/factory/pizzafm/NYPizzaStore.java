package com.hins.factory.pizzafm;

public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(PizzaEnum style) {
        Pizza pizza = null;
        switch (style) {
            case CHEESE:
                pizza = new NYStyleCheesePizza();
                break;
            case CLAM:
                pizza = new NYStyleClamPizza();
                break;
            case VEGGIE:
                pizza = new NYStyleVeggiePizza();
                break;
            case PEPPERONI:
                pizza = new NYStylePepperoniPizza();
                break;
            default:
                break;
        }
        return pizza;
    }
}
