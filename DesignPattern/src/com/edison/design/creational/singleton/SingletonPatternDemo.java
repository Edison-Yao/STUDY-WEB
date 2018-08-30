package com.edison.design.creational.singleton;

/**
 * @class SingletonPatternDemo
 * @date 2018/08/09
 * @author edisonyao
 * @description
 *
 * 意图：保证一个类仅有一个实例，并提供一个访问它的全局访问点。
 *
 * 主要解决：一个全局使用的类频繁地创建与销毁。
 *
 * 何时使用：当您想控制实例数目，节省系统资源的时候。
 *
 * 如何解决：判断系统是否已经有这个单例，如果有则返回，如果没有则创建。
 *
 * 关键代码：构造函数是私有的。
 */
public class SingletonPatternDemo {

    public static void main(String[] args){

        Singleton1 singleton1 = Singleton1.getInstance();

        singleton1.showMessage();

    }
}
