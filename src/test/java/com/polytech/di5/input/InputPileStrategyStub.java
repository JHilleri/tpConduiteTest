package com.polytech.di5.input;

import com.polytech.di5.model.Pile;

/**
 * InputPileStrategyStub
 */
public abstract class InputPileStrategyStub implements InputPileStrategy{
    private Pile pile;
    protected InputPileStrategyStub(Pile pile){
        this.pile = pile;
    }
	public void push(int entier) {
        pile.push(entier);
	}

	public Integer pop() {
		return pile.pop();
	}

	public void clear() {
        pile.clear();
	}

    
}