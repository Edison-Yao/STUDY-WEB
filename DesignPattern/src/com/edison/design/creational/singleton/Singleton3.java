package com.edison.design.creational.singleton;

/**
 * @author edisonyao
 * @class Singleton3
 * @date 18-8-10
 * @description
 * 懒汉式
 * 线程安全
 * 效率低
 */
public class Singleton3 {
    private static Singleton3 instance;

    private Singleton3(){}

    public static synchronized Singleton3 getInstance(){
        if (instance == null){
            instance = new Singleton3();
        }
        return instance;
    }
}
