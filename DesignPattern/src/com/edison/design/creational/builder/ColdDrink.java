package com.edison.design.creational.builder;

/**
 * @author edisonyao
 * @class ColdDrink
 * @date 18-8-10
 * @description
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
