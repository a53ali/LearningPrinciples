package com.company.OOP.Polymorphism;

/**
 * Created by adil on 24/02/16.
 */
public class DerivedClass extends BaseClass {

    @Override
    public double methodToOverride() //Derived Class method
    {
        System.out.println("I'm the method of DerivedClass");
        return 200;
    }

}
