package com.edison.design.creational.prototype;

/**
 * @author edisonyao
 * @class Square
 * @date 18-8-30
 * @description
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
