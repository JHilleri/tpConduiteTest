package com.polytech.di5.view;

import com.polytech.di5.model.Observable;

/**
 * Observer
 */
public interface Observer {
    void update(Observable observable, Object arg);
}