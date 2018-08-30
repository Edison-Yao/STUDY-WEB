package com.edison.design.creational.singleton;

/**
 * @class Singleton2
 * @date 18-8-10
 * @author edisonyao
 * @description
 * 懒汉式
 * 线程不安全
 */
public class Singleton2 {

    private static Singleton2 instance;

    private Singleton2(){}

    public static Singleton2 getInstance(){
        if(instance == null){
            instance = new Singleton2();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("singleton2 show msg");
    }
}
