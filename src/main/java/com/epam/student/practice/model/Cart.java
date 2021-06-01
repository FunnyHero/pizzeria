package com.epam.student.practice.model;

import com.epam.student.practice.model.goods.Drink;
import com.epam.student.practice.model.goods.Goods;
import com.epam.student.practice.model.goods.Pizza;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Goods> goodsList;

    public Cart() {
        this.goodsList = new ArrayList<>();
    }

    public Cart(Goods goods) {
        this.goodsList = new ArrayList<>();
        this.goodsList.add(goods);
    }

    public Cart(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }

    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }

    public void addGoods(Goods goods){
        this.goodsList.add(goods);
    }

    public boolean isLessThanSixPizzas(){
        int pizzasCounter = 0;

        for (Goods goods : goodsList) {
            if (goods instanceof Pizza){
                pizzasCounter += goods.getQuantity();
            }
        }

        return pizzasCounter < 6;
    }

    public boolean isLessThanFiveDrinks(){
        int drinksCounter = 0;

        for (Goods goods : goodsList) {
            if (goods instanceof Drink){
                drinksCounter += goods.getQuantity();
            }
        }

        return drinksCounter < 5;
    }

    public double getTotalCost(){
        int totalCost = 0;

        for (Goods goods : goodsList) {
            totalCost += goods.calculateCost();
        }

        return totalCost;
    }
}
