package com.edison.design.creational.builder;

/**
 * @author edisonyao
 * @class VegBurger
 * @date 18-8-10
 * @description
 */
public class VegBurger extends Burger {

    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
