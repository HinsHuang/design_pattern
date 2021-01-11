package com.hins.singleton;

public class App {

    public static void main(String[] args) {
        InitializingOnDemandHolderIdiom instance1 = InitializingOnDemandHolderIdiom.getInstance();
        InitializingOnDemandHolderIdiom instance2 = InitializingOnDemandHolderIdiom.getInstance();
        System.out.println("InitializingOnDemandHolderIdiom instnace = " + instance1);
        System.out.println("InitializingOnDemandHolderIdiom instnace = " + instance2);
        System.out.println();
        EnumIvoryTower instance3 = EnumIvoryTower.INSTANCE;
        EnumIvoryTower instance4 = EnumIvoryTower.INSTANCE;
        System.out.println("EnumIvoryTower instance = " + instance3);
        System.out.println("EnumIvoryTower instance = " + instance4);
        System.out.println();
        IvoryTower instance5 = IvoryTower.getInstance();
        IvoryTower instance6 = IvoryTower.getInstance();
        System.out.println("IvoryTower instance = " + instance5);
        System.out.println("IvoryTower instance = " + instance6);
        System.out.println();
        ThreadSafeLazyLoadedIvoryTower instance7 = ThreadSafeLazyLoadedIvoryTower.getInstance();
        ThreadSafeLazyLoadedIvoryTower instance8 = ThreadSafeLazyLoadedIvoryTower.getInstance();
        System.out.println("ThreadSafeLazyLoadedIvoryTower instance = " + instance7);
        System.out.println("ThreadSafeLazyLoadedIvoryTower instance = " + instance8);
        System.out.println();
        ThreadSafeDoubleCheckLocking instance9 = ThreadSafeDoubleCheckLocking.getInstance();
        ThreadSafeDoubleCheckLocking instance10 = ThreadSafeDoubleCheckLocking.getInstance();
        System.out.println("ThreadSafeDoubleCheckLockin instance = " + instance9);
        System.out.println("ThreadSafeDoubleCheckLockin instance = " + instance10);

    }
}
