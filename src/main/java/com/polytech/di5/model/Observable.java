package com.polytech.di5.model;

import com.polytech.di5.view.Observer;

/**
 * Observable
 */
public interface Observable {
    void setChanged();
    void notifyObservers();
    void addObserver(Observer observer);
}