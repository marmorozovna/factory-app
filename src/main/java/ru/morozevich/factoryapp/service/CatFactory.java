package ru.morozevich.factoryapp.service;

import ru.morozevich.factoryapp.entity.Cat;
import ru.morozevich.factoryapp.entity.CatType;
import ru.morozevich.factoryapp.entity.DomesticCat;
import ru.morozevich.factoryapp.entity.WildCat;

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

    public Cat createCat(CatType type) {
        Cat cat = null;
        switch (type) {
            case WILD:
                cat = new WildCat();
                break;
            case DOMESTIC:
                cat = new DomesticCat();
                break;
        }
        return cat;
    }
}
