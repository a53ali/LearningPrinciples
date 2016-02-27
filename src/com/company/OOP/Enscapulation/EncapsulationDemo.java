package com.company.OOP.Enscapulation;

/**
 * Encapsulation is:
 * Binding the data with the code that manipulates it.
 * It keeps the data and the code safe from external interference
 * Created by adil on 24/02/16.
 */
public class EncapsulationDemo {
    private int ssn;
    private String empName;
    private int empAge;

    //Getter and Setter methods
    public int getEmpSSN() {
        return ssn;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int newValue) {
        empAge = newValue;
    }

    public void setEmpName(String newValue) {
        empName = newValue;
    }

    public void setEmpSSN(int newValue) {
        ssn = newValue;
    }
}
