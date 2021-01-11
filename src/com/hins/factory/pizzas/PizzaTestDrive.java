package com.hins.factory.pizzas;

public class PizzaTestDrive {

    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza(PizzaEnum.CHEESE);
        System.out.println("We ordered a " + pizza.getName());
        System.out.println(pizza);

        System.out.println();

        pizza = store.orderPizza(PizzaEnum.VEGGIE);
        System.out.println("We ordered a " + pizza.getName());
        System.out.println(pizza);
    }
}
