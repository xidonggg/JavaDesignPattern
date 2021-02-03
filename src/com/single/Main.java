package com.single;

/**
 * @create: 2021-02-03 11:28
 * @author: yanbin
 * @description:
 **/

public class Main {
    public static void main(String[] args) {
        HungerySingleton hungerySingleton = HungerySingleton.getInstance();
        LazySingleton lazySingleton = LazySingleton.getInstance();
    }
}
