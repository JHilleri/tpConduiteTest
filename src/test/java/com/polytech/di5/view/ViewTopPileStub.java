package com.polytech.di5.view;

import com.polytech.di5.model.Observable;
import com.polytech.di5.model.Pile;

/**
 * ViewTopPileStub
 */
public class ViewTopPileStub implements Observer {
	private int updateCount = 0;
	private Pile pile;

	public ViewTopPileStub(Pile pile) {
		this.pile = pile;
	}

	public void update(Observable observable, Object arg) {
		if(observable == pile)
			++updateCount;
	}

	public int getUpdateCount() {
		return updateCount;
	}
}