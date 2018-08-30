package com.edison.design.creational.singleton;

/**
 * @author edisonyao
 * @class Singleton6
 * @date 18-8-10
 * @description
 * 静态内部类
 * 线程安全
 *
 */
public class Singleton6 {
    private static class SingletonHolder {
        private static final Singleton6 INSTANCE = new Singleton6();
    }

    private Singleton6(){}

    public static final Singleton6 getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
