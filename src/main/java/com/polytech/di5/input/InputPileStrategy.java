package com.polytech.di5.input;

/**
 * InputPileStrategy
 */
public interface InputPileStrategy {
    void push(int entier);
    Integer pop();
    void clear();
    void actionCommande();
}