package ru.morozevich.factoryapp.service;

import ru.morozevich.factoryapp.entity.CatColor;

import java.util.Random;

public class CatCreator {

    public CatColor chooseCatColor() {
        Random random = new Random();
        int randomNum = random.nextInt(1, 5);
        CatColor catColor = null;
        switch (randomNum) {
            case 1:
                catColor = CatColor.BLACK;
                break;
            case 2:
                catColor = CatColor.WHITE;
                break;
            case 3:
                catColor = CatColor.TORTOISESHELL;
                break;
            case 4:
                catColor = CatColor.GINGER;
                break;
        }
        return catColor;
    }

}
