package com.polytech.di5.model;

/**
 * Pile
 */
public interface Pile extends Observable{
    Integer getSizee();
    Integer getEntier(int index);
    void push(int entier);
    Integer pop();
    void clear();
}