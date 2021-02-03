package com.single;

/**
 * @create: 2021-02-03 11:30
 * @author: yanbin
 * @description: 单例模式-懒汉式
 * 优点：解决线程安全，延迟初始化（类加载时静态方法不会初始化）todo：静态子类
 **/

public class LazySingleton {
    private LazySingleton(){}

    public static LazySingleton getInstance() {
        return Holder.SINGLETON;
    }

    private static class Holder{
        private static final LazySingleton SINGLETON = new LazySingleton();
    }
}
