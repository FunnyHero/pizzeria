package com.epam.student.practice.dao;

import com.epam.student.practice.model.customer.Customer;
import com.epam.student.practice.model.goods.Drink;
import com.epam.student.practice.model.goods.Goods;
import com.epam.student.practice.model.goods.NutritionFacts;
import com.epam.student.practice.model.goods.Pizza;

import java.util.ArrayList;

public class Repository {

    private ArrayList<Goods> goodsList;

    public Repository() {
        this.goodsList = new ArrayList<>();
        goodsList.add(new Pizza("Мясная", new NutritionFacts(252, 11.1, 9.5, 29.1),
                175, 1, 660, 30,
                "Цыпленок, ветчина, пикантная пепперони, острая чоризо, моцарелла, томатный соус"));
        goodsList.add(new Pizza("Фирменная", new NutritionFacts(297, 11.1, 15.1, 27.3),
                275, 1, 640, 30,
                "Бекон, митболы из говядины, пикантная пепперони, моцарелла, томаты черри, шампиньоны, сладкий перец, красный лук, чеснок, томатный соус"));
        goodsList.add(new Pizza("Четыре сыра", new NutritionFacts(301.9, 12.7, 13.1, 31.3),
                1, 150, 0, 30,
                "Сыр блю чиз, сыры чеддер и пармезан, моцарелла, соус альфредо"));
        goodsList.add(new Pizza("Закрытая с грибами", new NutritionFacts(357, 8, 7, 19),
                1, 300, 500, 30,
                "Шампиньоны, помидоры, маслины, шпинат, сыр чеддер"));

        goodsList.add(new Drink("Пепси", new NutritionFacts(321,2,0,13),
                50,1,0.75));
        goodsList.add(new Drink("Морс", new NutritionFacts(213,1.2,0.4,12),
                70,1,0.75));
        goodsList.add(new Drink("Вода", new NutritionFacts(123,0,0,0),
                40,1,0.75));
    }

    public ArrayList<Goods> findAllGoods() {
        return this.goodsList;
    }

    public Goods findByName(String s) {
        return this.goodsList.stream().filter(goods -> goods.getName().equals(s)).findFirst().get();
    }

}
