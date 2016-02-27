package com.company.Patterns.AbstractFactoryPattern;

import com.company.Patterns.AbstractFactoryPattern.Color.Color;
import com.company.Patterns.AbstractFactoryPattern.Shape.Shape;

/**
 * Create an Abstract class to get factories for Color and Shape Objects.
 * <p/>
 * <p/>
 * Abstract factory: You have a factory that creates other factories, and these factories in turn
 * create objects derived from base classes. You do this because you often don't just want to
 * create a single object (as with Factory method) - rather, you want to create a collection of related objects.
 * <p/>
 * Created by adil on 24/02/16.
 */
public abstract class AbstractFactory {

    abstract Color getColor(String color);

    abstract Shape getShape(String shape);

}