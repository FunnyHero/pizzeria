package com.epam.student.practice.model.goods;

import java.util.UUID;

public class Drink extends Goods {
    private double volume;

    public Drink() {
    }

    public Drink(String name, NutritionFacts nutritionFacts, double cost, int quantity, double volume) {
        super(name, nutritionFacts, cost, quantity);
        this.volume = volume;
    }

    public Drink(UUID id, String name, NutritionFacts nutritionFacts, double cost, int quantity, double volume) {
        super(id, name, nutritionFacts, cost, quantity);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
