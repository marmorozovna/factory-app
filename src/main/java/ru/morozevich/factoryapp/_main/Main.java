package ru.morozevich.factoryapp._main;

import ru.morozevich.factoryapp.entity.Cat;
import ru.morozevich.factoryapp.factory.CatFactory;
import ru.morozevich.factoryapp.util.CatCatColorComparator;
import ru.morozevich.factoryapp.util.CatWeightComparator;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        CatFactory factory = CatFactory.getFactory();
        ArrayList<Cat> catList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            catList.add(factory.createCat());
        }
        System.out.println(catList);
        Comparator<Cat> catComparatorColor = new CatCatColorComparator()
                .thenComparing((new CatWeightComparator()));
        catList.sort(catComparatorColor);
        System.out.println(catList);
    }
}