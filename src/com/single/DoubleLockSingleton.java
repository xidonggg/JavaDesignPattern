package com.single;

/**
 * @create: 2021-02-03 11:52
 * @author: yanbin
 * @description:单例模式-双重检查锁
 * 防止在创建类的时候另一个线程抢先将类创建
 **/

public class DoubleLockSingleton {
    private volatile static DoubleLockSingleton singleton;

    private DoubleLockSingleton() {}

    public DoubleLockSingleton getInstance() {
        if (null == singleton) {
            synchronized (DoubleLockSingleton.class) {
                if (null == singleton) {
                    singleton = new DoubleLockSingleton();
                }
            }
        }
        return singleton;
    }
}
