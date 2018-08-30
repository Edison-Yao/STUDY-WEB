package com.edison.design.creational.builder;

/**
 * @author edisonyao
 * @class Pepsi
 * @date 18-8-10
 * @description
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
