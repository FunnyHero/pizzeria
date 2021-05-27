package com.epam.student.practice.model.goods;

import java.util.UUID;

public abstract class Goods {
    private UUID id;

    private String name;

    private NutritionFacts nutritionFacts;

    private double cost;

    private int quantity;

    public Goods() {
    }

    public Goods(String name, NutritionFacts nutritionFacts, double cost, int quantity) {
        this.name = name;
        this.nutritionFacts = nutritionFacts;
        this.cost = cost;
        this.quantity = quantity;
    }

    public Goods(UUID id, String name, NutritionFacts nutritionFacts, double cost, int quantity) {
        this.id = id;
        this.name = name;
        this.nutritionFacts = nutritionFacts;
        this.cost = cost;
        this.quantity = quantity;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NutritionFacts getNutritionFacts() {
        return nutritionFacts;
    }

    public void setNutritionFacts(NutritionFacts nutritionFacts) {
        this.nutritionFacts = nutritionFacts;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double calculateCost(){
        return cost * quantity;
    }
}
