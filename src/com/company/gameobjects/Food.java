package com.company.gameobjects;

public class Food extends ObjectOnScreen {
    public int growthFactor;
    public Food(int x, int y) {
        super(x, y, 'F');
        this.growthFactor = 1;
    }
}


