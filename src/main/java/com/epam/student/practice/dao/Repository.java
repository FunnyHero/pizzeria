package com.epam.student.practice.dao;

import com.epam.student.practice.model.Order;
import com.epam.student.practice.model.goods.Drink;
import com.epam.student.practice.model.goods.Goods;
import com.epam.student.practice.model.goods.NutritionFacts;
import com.epam.student.practice.model.goods.Pizza;

import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

public final class Repository {

    private static Repository repository;

    private Collection<Goods> goodsList;

    private Collection<Order> orderList;

    private void initGoodsList(){
        goodsList.add(new Pizza(UUID.randomUUID(),"Мясная", new NutritionFacts(252, 11.1, 9.5, 29.1),
                175, 1, 660, 30,
                "Цыпленок, ветчина, пикантная пепперони, острая чоризо, моцарелла, томатный соус"));
        goodsList.add(new Pizza(UUID.randomUUID(),"Фирменная", new NutritionFacts(297, 11.1, 15.1, 27.3),
                275, 1, 640, 30,
                "Бекон, митболы из говядины, пикантная пепперони, моцарелла, томаты черри, шампиньоны, сладкий перец, красный лук, чеснок, томатный соус"));
        goodsList.add(new Pizza(UUID.randomUUID(),"Четыре сыра", new NutritionFacts(301.9, 12.7, 13.1, 31.3),
                1, 150, 0, 30,
                "Сыр блю чиз, сыры чеддер и пармезан, моцарелла, соус альфредо"));
        goodsList.add(new Pizza(UUID.randomUUID(),"Закрытая с грибами", new NutritionFacts(357, 8, 7, 19),
                1, 300, 500, 30,
                "Шампиньоны, помидоры, маслины, шпинат, сыр чеддер"));

        goodsList.add(new Drink(UUID.randomUUID(),"Пепси", new NutritionFacts(321,2,0,13),
                50,1,0.75));
        goodsList.add(new Drink(UUID.randomUUID(),"Морс", new NutritionFacts(213,1.2,0.4,12),
                70,1,0.75));
        goodsList.add(new Drink(UUID.randomUUID(),"Вода", new NutritionFacts(123,0,0,0),
                40,1,0.75));
    }

    private Repository() {
        goodsList = new ArrayList<Goods>();
        orderList = new ArrayList<Order>();
        initGoodsList();
    }

    public static Repository getInstance() {
        if (repository == null){
            repository = new Repository();
        }
        return repository;
    }

    public Collection<Goods> findAllGoods() {
        return goodsList;
    }

    public Collection<Goods> findGoodsByName(String s) {
        Collection<Goods> filteredByName = new ArrayList<>();

        goodsList.forEach(goods -> {
            if (goods.getName().contains(s)){
                filteredByName.add(goods);
            }
        });
        return filteredByName;
    }

    public Goods findGoodsById(UUID id){
        return goodsList.stream().filter(goods -> goods.getId().equals(id)).findFirst().orElse(null);
    }

    public Order findOrderById(UUID id){
        return orderList.stream().filter(order -> order.getId().equals(id)).findFirst().orElse(null);
    }

    public UUID createOrder(Order order){
        order.setId(UUID.randomUUID());
        orderList.add(order);
        return order.getId();
    }
}
