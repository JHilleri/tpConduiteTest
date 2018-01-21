package com.polytech.di5;

import org.junit.Assert;
import org.junit.Test;

import com.polytech.di5.input.InputPileDriver;
import com.polytech.di5.model.Pile;
import com.polytech.di5.model.PileImpl;
import com.polytech.di5.model.PileStub;
import com.polytech.di5.view.ViewBottomPileStub;
import com.polytech.di5.view.ViewTopPileStub;

public class Tests {
    public Pile getNewPile() {
        return new PileImpl();
    }

    @Test
    public void test1() {
        Pile pile = getNewPile();
        InputPileDriver driver = new InputPileDriver(pile);
        ViewBottomPileStub bottomView = new ViewBottomPileStub(pile);
        ViewTopPileStub topView = new ViewTopPileStub(pile);

        pile.addObserver(bottomView);
        pile.addObserver(topView);

        Assert.assertTrue(driver.test_1(bottomView, topView));
    }

    @Test
    public void test2() {
        Pile pile = getNewPile();
        InputPileDriver driver = new InputPileDriver(pile);
        ViewBottomPileStub bottomView = new ViewBottomPileStub(pile);
        ViewTopPileStub topView = new ViewTopPileStub(pile);

        pile.addObserver(bottomView);
        pile.addObserver(topView);

        Assert.assertTrue(driver.test_2(bottomView, topView));
    }

    @Test
    public void test2_insertBefor() {
        Pile pile = getNewPile();
        InputPileDriver driver = new InputPileDriver(pile);
        ViewBottomPileStub bottomView = new ViewBottomPileStub(pile);
        ViewTopPileStub topView = new ViewTopPileStub(pile);

        pile.push(1);
        pile.push(1);
        pile.push(1);
        pile.push(1);
        pile.push(1);

        pile.addObserver(bottomView);
        pile.addObserver(topView);

        Assert.assertTrue(driver.test_2(bottomView, topView));
    }

    @Test
    public void test2_insertInMidle() {
        Pile pile = getNewPile();
        InputPileDriver driver = new InputPileDriver(pile);
        ViewBottomPileStub bottomView = new ViewBottomPileStub(pile);
        ViewTopPileStub topView = new ViewTopPileStub(pile);

        pile.addObserver(bottomView);

        pile.push(1);
        pile.push(1);
        pile.push(1);
        pile.push(1);
        pile.push(1);

        pile.addObserver(topView);

        Assert.assertTrue(driver.test_2(bottomView, topView));
    }

    @Test
    public void test2_inssertAfter() {
        Pile pile = getNewPile();
        InputPileDriver driver = new InputPileDriver(pile);
        ViewBottomPileStub bottomView = new ViewBottomPileStub(pile);
        ViewTopPileStub topView = new ViewTopPileStub(pile);

        pile.addObserver(bottomView);
        pile.addObserver(topView);

        pile.push(1);
        pile.push(1);
        pile.push(1);
        pile.push(1);
        pile.push(1);

        Assert.assertTrue(driver.test_2(bottomView, topView));
    }

    @Test
    public void test3() {
        Pile pile = getNewPile();
        InputPileDriver driver = new InputPileDriver(pile);
        ViewBottomPileStub bottomView = new ViewBottomPileStub(pile);
        ViewTopPileStub topView = new ViewTopPileStub(pile);

        pile.addObserver(bottomView);
        pile.addObserver(topView);

        Assert.assertTrue(driver.test_3(bottomView, topView));
    }
}
