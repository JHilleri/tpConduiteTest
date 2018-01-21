package com.polytech.di5.view;

import com.polytech.di5.model.Observable;
import com.polytech.di5.model.Pile;

/**
 * ViewBottomPileStub
 */
public class ViewBottomPileStub implements Observer{
	private int updateCount = 0;
	private Pile pile;
	public ViewBottomPileStub(Pile pile){
		this.pile = pile;
	}
	public void update(Observable observable, Object arg) {
		if(pile == observable)
		{
			if(pile.getSize() <= 5)
				++updateCount;
		}
	}
	public int getUpdateCount(){
		return updateCount;
	}
}