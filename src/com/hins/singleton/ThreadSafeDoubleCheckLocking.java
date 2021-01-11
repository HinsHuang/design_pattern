package com.hins.singleton;

public class ThreadSafeDoubleCheckLocking {

    private static volatile ThreadSafeDoubleCheckLocking instance;
    private static boolean flag = true;

    private ThreadSafeDoubleCheckLocking() {
        if (flag) {
            flag = false;
        } else {
            throw new IllegalStateException("Already initialized");
        }
    }

    public static ThreadSafeDoubleCheckLocking getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeDoubleCheckLocking.class) {
                if (instance == null) {
                    instance = new ThreadSafeDoubleCheckLocking();
                }
            }

        }

        return instance;
    }


}
