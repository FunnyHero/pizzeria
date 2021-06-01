package com.epam.student.practice.dto;

import java.util.UUID;

public class OrderDTO {
    UUID goodsID;

    int quantity;

    public OrderDTO(UUID goodsID, int quantity) {
        this.goodsID = goodsID;
        this.quantity = quantity;
    }

    public OrderDTO() {
    }

    public UUID getGoodsID() {
        return goodsID;
    }

    public void setGoodsID(UUID goodsID) {
        this.goodsID = goodsID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
//    private List<String> goodsNameList;
//
//    public OrderDTO() {
//    }
//
//    public OrderDTO(List<String> goodsNameList) {
//        this.goodsNameList = goodsNameList;
//    }
//
//    public List<String> getGoodsNameList() {
//        return goodsNameList;
//    }
//
//    public void setGoodsNameList(List<String> goodsNameList) {
//        this.goodsNameList = goodsNameList;
//    }
}