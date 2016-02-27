package com.company.Patterns.AbstractFactoryPattern;

import com.company.Patterns.AbstractFactoryPattern.Color.Color;
import com.company.Patterns.AbstractFactoryPattern.Shape.Circle;
import com.company.Patterns.AbstractFactoryPattern.Shape.Rectangle;
import com.company.Patterns.AbstractFactoryPattern.Shape.Shape;

/**
 * Created by adil on 24/02/16.
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {

        if (shapeType == null) {
            return null;
        }

        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }

        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }

        return null;
    }

    @Override
    Color getColor(String color) {
        return null;
    }
}