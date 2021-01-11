package com.hins.factory.pizzafm;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore cgStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza(PizzaEnum.CHEESE);
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = cgStore.orderPizza(PizzaEnum.CHEESE);
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza(PizzaEnum.CLAM);
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = cgStore.orderPizza(PizzaEnum.CLAM);
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza(PizzaEnum.PEPPERONI);
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = cgStore.orderPizza(PizzaEnum.PEPPERONI);
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza(PizzaEnum.VEGGIE);
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = cgStore.orderPizza(PizzaEnum.VEGGIE);
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
