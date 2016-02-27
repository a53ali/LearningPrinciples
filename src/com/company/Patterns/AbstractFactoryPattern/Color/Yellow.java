package com.company.Patterns.AbstractFactoryPattern.Color;

/**
 * Created by adil on 24/02/16.
 */
public class Yellow implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Yellow::fill() method.");
    }
}