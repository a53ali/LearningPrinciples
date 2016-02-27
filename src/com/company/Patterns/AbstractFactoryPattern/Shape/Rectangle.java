package com.company.Patterns.AbstractFactoryPattern.Shape;

/**
 * Created by adil on 24/02/16.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}