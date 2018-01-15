package com.polytech.di5.input;

import com.polytech.di5.model.Pile;

/**
 * KdbInputPileDriver
 */
public class InputPileDriver extends InputPileStrategyStub{

    private Pile pile;
    public InputPileDriver(Pile pile){
        super(pile);
        this.pile = pile;
    }

    public boolean test_1() {
        for(int i = 0; i < 5; ++i){
            if(this.pile.getSize() != i) return false;
            this.push(10);
        }
        push(10);
        return (this.pile.getSize() == 6);
    }

	public void actionCommande() {
		
	}
}