package com.edison.design.creational.prototype;

/**
 * @author edisonyao
 * @class Rectangle
 * @date 18-8-30
 * @description
 */
public class Rectangle extends Shape {
    public Rectangle(){
        type = "Rectangle";
    }


    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
