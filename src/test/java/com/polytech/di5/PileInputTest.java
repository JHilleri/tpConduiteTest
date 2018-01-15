package com.polytech.di5;

import org.junit.Assert;
import org.junit.Test;

import com.polytech.di5.input.InputPileDriver;
import com.polytech.di5.model.Pile;
import com.polytech.di5.model.PileStub;


public class PileInputTest
{
    @Test
    public void test1(){
        Pile pile = new PileStub();
        InputPileDriver driver = new InputPileDriver(pile);
        Assert.assertTrue(driver.test_1());
    }
}
