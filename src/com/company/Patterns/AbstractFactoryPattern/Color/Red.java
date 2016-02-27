package com.company.Patterns.AbstractFactoryPattern.Color;

/**
 * Created by adil on 24/02/16.
 */
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}