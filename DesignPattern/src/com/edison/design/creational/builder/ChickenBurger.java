package com.edison.design.creational.builder;

/**
 * @author edisonyao
 * @class ChickenBurger
 * @date 18-8-10
 * @description
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
