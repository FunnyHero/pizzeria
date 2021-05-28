package com.epam.student.practice.dto;

import java.util.UUID;

public class MenuDTO {
    UUID goodsID;

    String name;

    double cost;

    public MenuDTO(UUID goodsID, String name, double cost) {
        this.goodsID = goodsID;
        this.name = name;
        this.cost = cost;
    }

    public MenuDTO() {
    }

    public UUID getGoodsID() {
        return goodsID;
    }

    public void setGoodsID(UUID goodsID) {
        this.goodsID = goodsID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
