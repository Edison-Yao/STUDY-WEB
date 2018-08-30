package com.edison.design.creational.prototype;

/**
 * @author edisonyao
 * @class Circle
 * @date 18-8-30
 * @description
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
