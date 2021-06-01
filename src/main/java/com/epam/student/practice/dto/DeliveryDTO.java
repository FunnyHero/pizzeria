package com.epam.student.practice.dto;

import java.util.UUID;

public class DeliveryDTO {
    UUID orderID;

    public DeliveryDTO(UUID orderID) {
        this.orderID = orderID;
    }

    public DeliveryDTO() {
    }

    public UUID getOrderID() {
        return orderID;
    }

    public void setOrderID(UUID orderID) {
        this.orderID = orderID;
    }
}
