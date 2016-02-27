package com.company.Patterns.AbstractFactoryPattern;

import com.company.Patterns.AbstractFactoryPattern.Color.Color;
import com.company.Patterns.AbstractFactoryPattern.Color.Red;
import com.company.Patterns.AbstractFactoryPattern.Color.Yellow;
import com.company.Patterns.AbstractFactoryPattern.Shape.Shape;

/**
 * Created by adil on 24/02/16.
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    Color getColor(String color) {
        if (color == null) {
            return null;
        }

        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        }
        if (color.equalsIgnoreCase("YELLOW")) {
            return new Yellow();
        }
        return null;
    }
}