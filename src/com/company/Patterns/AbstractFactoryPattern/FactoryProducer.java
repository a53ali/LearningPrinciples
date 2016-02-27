package com.company.Patterns.AbstractFactoryPattern;

/**
 * Create a Factory generator/producer class to get factories by passing an information such as Shape or Color
 * <p/>
 * Created by adil on 24/02/16.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {

        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        }

        if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }

        return null;
    }
}