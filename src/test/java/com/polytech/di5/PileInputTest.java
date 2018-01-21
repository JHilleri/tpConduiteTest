package com.polytech.di5;

import org.junit.Assert;
import org.junit.Test;

import com.polytech.di5.input.InputPileDriver;
import com.polytech.di5.model.Pile;
import com.polytech.di5.model.PileStub;
import com.polytech.di5.view.ViewBottomPileStub;
import com.polytech.di5.view.ViewTopPileStub;


public class PileInputTest
{
    @Test
    public void test1(){
        Pile pile = new PileStub();
        InputPileDriver driver = new InputPileDriver(pile);
        ViewBottomPileStub bottomView = new ViewBottomPileStub();
        ViewTopPileStub topView = new ViewTopPileStub();

        pile.addObserver(bottomView);
        pile.addObserver(topView);

        Assert.assertTrue(driver.test_1(bottomView, topView));
    }
}
