package com.hins.factory.pizzafm;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(PizzaEnum style) {
        Pizza pizza = null;
        switch (style) {
            case PEPPERONI:
                pizza = new ChicagoStylePepperoniPizza();
                break;
            case VEGGIE:
                pizza = new ChicagoStyleVeggiePizza();
                break;
            case CLAM:
                pizza = new ChicagoStyleClamPizza();
                break;
            case CHEESE:
                pizza = new ChicagoStyleCheesePizza();
                break;
            default:
                break;
        }
        return pizza;
    }
}
