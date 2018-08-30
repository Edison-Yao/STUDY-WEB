package com.edison.design.creational.singleton;

public class Singleton1 {

    private static Singleton1 instance = new Singleton1();

    private Singleton1(){}

    public static Singleton1 getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("singleton show msg");
    }
}
