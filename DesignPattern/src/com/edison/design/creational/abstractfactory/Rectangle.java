package com.edison.design.creational.abstractfactory;

import com.edison.design.creational.abstractfactory.Shape;

public class Rectangle implements Shape {


    @Override
    public void draw() {
        System.out.println("draw rectangle");
    }
}
