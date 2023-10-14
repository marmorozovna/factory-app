package ru.morozevich.factoryapp.entity;

public enum CatColor {
    WHITE(74),
    BLACK(13),
    GINGER(56),
    TORTOISESHELL(99);

    final int rateNum;

    CatColor(int rateNum) {
        this.rateNum = rateNum;
    }

    public int getRateNum() {
        return rateNum;
    }
}
