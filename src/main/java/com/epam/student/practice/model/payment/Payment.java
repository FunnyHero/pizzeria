package com.epam.student.practice.model.payment;

import java.math.BigDecimal;

public class Payment {
    private BigDecimal amount;

    private Currency currency;

    private PaymentType paymentType;

    public Payment(BigDecimal amount, Currency currency, PaymentType paymentType) {
        this.amount = amount;
        this.currency = currency;
        this.paymentType = paymentType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }
}
