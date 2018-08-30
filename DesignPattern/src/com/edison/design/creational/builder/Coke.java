package com.edison.design.creational.builder;

/**
 * @author edisonyao
 * @class Coke
 * @date 18-8-10
 * @description
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
