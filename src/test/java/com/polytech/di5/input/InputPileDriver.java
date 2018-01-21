package com.polytech.di5.input;

import com.polytech.di5.model.Pile;
import com.polytech.di5.view.ViewBottomPileStub;
import com.polytech.di5.view.ViewTopPileStub;

/**
 * KdbInputPileDriver
 */
public class InputPileDriver extends InputPileStrategyStub{

    private Pile pile;
    public InputPileDriver(Pile pile){
        super(pile);
        this.pile = pile;
    }

    public boolean test_1(ViewBottomPileStub botObserver, ViewTopPileStub topObserver) {
        int initial_botUpdateCount = botObserver.getUpdateCount();
        int initial_topUpdateCount = topObserver.getUpdateCount();

        for(int i = 0; i < 5; ++i){
            if(this.pile.getSize() != i) return false;
            this.push(10);
            if(botObserver.getUpdateCount() != i + 1 || botObserver.getUpdateCount() != i + 1)
                return false;
        }
        push(10);
        return (this.pile.getSize() == 6
            && (botObserver.getUpdateCount() - initial_botUpdateCount) == 5
            && (topObserver.getUpdateCount() - initial_topUpdateCount) == 6
        );
    }

    public boolean test_2(ViewBottomPileStub botObserver, ViewTopPileStub topObserver) {
        int initial_botUpdateCount = botObserver.getUpdateCount();
        int initial_topUpdateCount = topObserver.getUpdateCount();
        int initial_pileSize = pile.getSize();

        push(10);
        return (this.pile.getSize() - initial_pileSize == 1 
            && ( ( pile.getSize() <= 5 && (botObserver.getUpdateCount() - initial_botUpdateCount) == 1) 
                || (pile.getSize() > 5 && botObserver.getUpdateCount() == initial_botUpdateCount))
            && (topObserver.getUpdateCount() - initial_topUpdateCount) == 1
        );
    }

    public boolean test_3(ViewBottomPileStub botObserver, ViewTopPileStub topObserver) {
        int initial_botUpdateCount = botObserver.getUpdateCount();
        int initial_topUpdateCount = topObserver.getUpdateCount();

        for(int i = 0; i < 5; ++i){
            if(this.pile.getSize() != i) return false;
            this.push(10);
        }
        push(10);
        return (this.pile.getSize() == 6
            && (botObserver.getUpdateCount() - initial_botUpdateCount) == 5
            && (topObserver.getUpdateCount() - initial_topUpdateCount) == 6
        );
    }

	public void actionCommande() {}
}