package com.single;

/**
 * @create: 2021-02-03 11:23
 * @author: yanbin
 * @description: 单例模式-饿汉式
 * 优点：没有线程安全问题，简单
 * 缺点；1、提前初始化会延长类加载器加载类的时间2、如果不使用会浪费内存空间3、不能传递参数
 **/

public class HungerySingleton {
    private static final HungerySingleton instance = new HungerySingleton();
    private HungerySingleton() {};

    public static HungerySingleton getInstance() {
        return instance;
    }
}
