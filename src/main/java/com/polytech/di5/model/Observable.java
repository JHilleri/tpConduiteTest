package com.polytech.di5.model;

/**
 * Observable
 */
public interface Observable {
    void setChanged();
    void notifyObservers();
}