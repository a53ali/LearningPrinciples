package com.company.Patterns.ObserverPattern;

/**
 * Created by adil on 26/02/16.
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
