package com.edison.design.creational.abstractfactory;

import com.edison.design.creational.abstractfactory.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("draw square");
    }
}
