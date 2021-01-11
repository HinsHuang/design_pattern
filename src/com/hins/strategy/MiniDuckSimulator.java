package com.hins.strategy;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck model = new DecoyDuck();
        model.performFly();
        model.performQuack();
        model.setFlyBehavior(new FlyRockerPowered());
        model.performFly();

        model = new MallardDuck();
        model.performFly();
        model.performQuack();
    }
}
