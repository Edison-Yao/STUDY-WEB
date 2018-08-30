package com.edison.design.creational.singleton;

/**
 * @author edisonyao
 * @class Singleton4
 * @date 18-8-10
 * @description
 * 饿汉式
 * 线程安全
 *
 */
public class Singleton4 {
    private static Singleton4 instance = new Singleton4();

    private Singleton4(){}

    private static Singleton4 getInstance(){
        return instance;
    }
}
