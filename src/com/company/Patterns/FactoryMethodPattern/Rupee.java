package com.company.Patterns.FactoryMethodPattern;

/**
 * Created by adil on 24/02/16.
 * Concrete Rupee Dollar code
 */
public class Rupee implements Currency {

    @Override
    public String getSymbol() {
        return "Rs";
    }

}



