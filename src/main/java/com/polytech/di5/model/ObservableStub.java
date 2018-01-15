package com.polytech.di5.model;


import java.util.ArrayList;
import java.util.List;

import com.polytech.di5.view.Observer;

/**
 * ObservableStub
 */
public abstract class ObservableStub implements Observable{
    private List<Observer> observers = new ArrayList<Observer>();
    private boolean changed = false;
	public void setChanged() {
        changed = true;
	}

	public void notifyObservers() {
        if(changed){
            for (Observer observer : observers) {
                observer.update(this, null);
            }
            changed = false;
        }
    }
    
    public void addObserver(Observer observer){
        observers.add(observer);
    }
}