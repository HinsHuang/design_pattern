package com.hins.singleton;

public class ThreadSafeLazyLoadedIvoryTower {

    private static volatile ThreadSafeLazyLoadedIvoryTower instance;

    private ThreadSafeLazyLoadedIvoryTower() {
        if (instance == null) {
            instance = this;
        } else {
            throw new IllegalStateException("Already initialized");
        }
    }

    public static ThreadSafeLazyLoadedIvoryTower getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeLazyLoadedIvoryTower.class) {
                if (instance == null) {
                    instance = new ThreadSafeLazyLoadedIvoryTower();
                }
            }
        }
        return instance;
    }
}
