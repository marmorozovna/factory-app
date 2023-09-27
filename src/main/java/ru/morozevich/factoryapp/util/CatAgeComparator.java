package ru.morozevich.factoryapp.util;

import ru.morozevich.factoryapp.entity.Cat;

import java.util.Comparator;

public class CatAgeComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1.getAge() > o2.getAge())
            return 1;
        else if (o1.getAge() < o2.getAge())
            return -1;
        else
            return 0;
    }
}