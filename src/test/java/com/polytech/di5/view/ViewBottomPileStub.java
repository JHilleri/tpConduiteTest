package com.polytech.di5.view;

import com.polytech.di5.model.Observable;

/**
 * ViewBottomPileStub
 */
public class ViewBottomPileStub implements Observer{
	private int updateCount = 0;
	public void update(Observable observable, Object arg) {
		++updateCount;
	}
	public int getUpdateCount(){
		return updateCount;
	}
}