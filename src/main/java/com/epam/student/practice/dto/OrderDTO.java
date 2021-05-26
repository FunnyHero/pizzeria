package com.epam.student.practice.dto;

import java.util.List;
import java.util.UUID;

public class OrderDTO {

    private List<String> goodsNameList;

    public OrderDTO() {
    }

    public OrderDTO(List<String> goodsNameList) {
        this.goodsNameList = goodsNameList;
    }

    public List<String> getGoodsNameList() {
        return goodsNameList;
    }

    public void setGoodsNameList(List<String> goodsNameList) {
        this.goodsNameList = goodsNameList;
    }
}