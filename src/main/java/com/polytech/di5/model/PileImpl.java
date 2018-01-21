package com.polytech.di5.model;

import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

import com.polytech.di5.view.Observer;

/**
 * PileImpl
 */
public class PileImpl implements Pile, Observable{
    private Stack<Integer> pile = new Stack<>();
    private boolean hasChanged = false;
    private List<Observer> observers = new ArrayList<>();

	public void setChanged() {
		hasChanged = true;
	}

	public void notifyObservers() {
		if(hasChanged){
            for(Observer observer: observers){
                observer.update(this, getSize());
            }
        }
	}

	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	public Integer getSize() {
		return pile.size();
	}

	public Integer getEntier(int index) {
		return pile.elementAt(index);
	}

	public void push(int entier) {
        pile.add(entier);
        setChanged();
        notifyObservers();
	}

	public Integer pop() {
        Integer value = pile.pop();
        setChanged();
        notifyObservers();
		return value;
	}

	public void clear() {
        pile.clear();
        setChanged();
        notifyObservers();
	}

    
}