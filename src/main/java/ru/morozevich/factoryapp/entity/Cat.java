package ru.morozevich.factoryapp.entity;

import ru.morozevich.factoryapp.service.CatCreator;

import java.util.Random;

public class Cat {
    CatColor catColor;
    int age;
    int weight;
    long id;

    public Cat() {
        Random random = new Random();
        CatCreator catCreator = new CatCreator();
        this.catColor = catCreator.chooseCatColor();
        this.age = random.nextInt(0, 16);
        this.weight = random.nextInt(3, 11);
        this.id = catColor.hashCode() + Integer.valueOf(age).hashCode() + Double.valueOf(weight).hashCode();
        if (this.id<0){
            this.id = -this.id;
        }
    }

    @Override
    public String toString() {
        return "Кошка с id: " + this.id + "; вес: " + this.weight + "; возраст: " + this.age + "; цвет: " + this.catColor+"\n";
    }

    public CatColor getCatColor(){
        return this.catColor;
    }

    public int getAge() {
        return age;
    }

    public long getId() {
        return id;
    }

    public int getWeight() {
        return weight;
    }
}
