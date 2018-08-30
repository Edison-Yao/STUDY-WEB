package com.edison.design.creational.singleton;

/**
 * @author edisonyao
 * @class Singleton5
 * @date 18-8-10
 * @description
 * 双重校验锁
 * 线程安全
 * 高性能
 * 需加上volatile修饰
 * <a>https://blog.csdn.net/chenchaofuck1/article/details/51702129</a>
 */
public class Singleton5 {
    private volatile static Singleton5 instance;

    private Singleton5(){}

    public static Singleton5 getInstance(){
        if (instance == null){
            synchronized (Singleton5.class){
                if(instance == null){
                    instance = new Singleton5();
                }
            }
        }
        return instance;
    }
}
