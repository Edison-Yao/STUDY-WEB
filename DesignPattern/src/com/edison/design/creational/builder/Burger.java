package com.edison.design.creational.builder;

/**
 * @author edisonyao
 * @class Burger
 * @date 18-8-10
 * @description
 */
public abstract class Burger implements Item{

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
