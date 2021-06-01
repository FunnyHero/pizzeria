package com.epam.student.practice.model.goods;

import java.util.UUID;

public class Pizza extends Goods {
    private int weight;

    private  int diameter;

    private String ingredients;

    public Pizza() {
    }

    public Pizza(String name, NutritionFacts nutritionFacts, double cost,
                 int quantity, int weight, int diameter, String ingredients) {
        super(name, nutritionFacts, cost, quantity);
        this.weight = weight;
        this.diameter = diameter;
        this.ingredients = ingredients;
    }

    public Pizza(UUID id, String name, NutritionFacts nutritionFacts,
                 double cost, int quantity, int weight, int diameter, String ingredients) {
        super(id, name, nutritionFacts, cost, quantity);
        this.weight = weight;
        this.diameter = diameter;
        this.ingredients = ingredients;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }
}
