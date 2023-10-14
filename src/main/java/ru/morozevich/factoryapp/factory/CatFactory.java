package ru.morozevich.factoryapp.factory;

import ru.morozevich.factoryapp.entity.*;

import java.util.Random;

public class CatFactory {
    private static CatFactory factory;

    private CatFactory() {
    }

    public static CatFactory getFactory() {
        if (factory == null) {
            factory = new CatFactory();
        }
        return factory;
    }

    public Cat createCat() {
        Cat cat = null;
        Random random = new Random();
        int randonum = random.nextInt(1, 5);
        switch (randonum) {
            case 1:
                cat = new WhiteCat(CatColor.WHITE);
                break;
            case 2:
                cat = new BlackCat(CatColor.BLACK);
                break;
            case 3:
                cat = new GingerCat(CatColor.GINGER);
                break;
            case 4:
                cat = new Tortoiseshell(CatColor.TORTOISESHELL);
                break;
        }
        return cat;
    }
}
