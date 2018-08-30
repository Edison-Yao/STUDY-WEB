package com.edison.design.creational.builder;

/**
 * @author edisonyao
 * @interface Item
 * @date 18-8-10
 * @description
 */
public interface Item {
    public String name();

    public Packing packing();

    public float price();
}

