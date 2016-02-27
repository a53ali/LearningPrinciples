package com.company.Patterns.FactoryMethodPattern;

/***
 * Factory method: You have a factory that creates objects that derive from a particular base class
 * <p/>
 * Created by adil on 24/02/16.
 */
public class CurrencyFactory {

    public static Currency createCurrency(String country) {
        if (country.equalsIgnoreCase("India")) {
            return new Rupee();
        } else if (country.equalsIgnoreCase("US")) {
            return new USDollar();
        }
        throw new IllegalArgumentException("No such currency");
    }
}


