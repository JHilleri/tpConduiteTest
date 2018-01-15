package com.polytech.di5.model;

/**
 * PileStub
 */
public class PileStub extends ObservableStub implements Pile{
	private int size = 0;
    
	public Integer getSize() {
		return size;
	}

	public Integer getEntier(int index) {
		return 1;
	}

	public void push(int entier) {
		++size;
		setChanged();
		notifyObservers();
	}

	public Integer pop() {
		--size;
		setChanged();
		notifyObservers();
		return 1;
	}

	public void clear() {
		size = 0;
		setChanged();
		notifyObservers();
	}
}