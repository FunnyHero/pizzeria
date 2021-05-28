package com.epam.student.practice.model;

import com.epam.student.practice.model.customer.Customer;
import com.epam.student.practice.model.payment.Payment;

import java.util.UUID;

public class Order {
    private UUID id;

    private Cart cart;

    private Customer customer;

    private Payment payment;

    public Order() {
    }

    public Order(Cart cart, Customer customer, Payment payment) {
        this.cart = cart;
        this.customer = customer;
        this.payment = payment;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
