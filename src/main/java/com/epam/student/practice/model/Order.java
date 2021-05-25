package com.epam.student.practice.model;

import com.epam.student.practice.model.customer.Customer;
import com.epam.student.practice.model.payment.Payment;

public class Order {
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
