package com.edison.design.creational.builder;

/**
 * @author edisonyao
 * @class Bottle
 * @date 18-8-10
 * @description
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
