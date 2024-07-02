package com.example.domain;

public class OrderAggregate {

    private Order order;

    public OrderAggregate(Order order) {
        this.order = order;
    }

    /*
    public void confirmOrder() {
        if (order.getStatus() == OrderStatus.PENDING) {
            order.updateStatus(OrderStatus.CONFIRMED);
        } else {
            throw new IllegalStateException("Order cannot be confirmed");
        }
    }

    public void shipOrder() {
        if (order.getStatus() == OrderStatus.CONFIRMED) {
            order.updateStatus(OrderStatus.SHIPPED);
        } else {
            throw new IllegalStateException("Order cannot be shipped");
        }
    }

    public void deliverOrder() {
        if (order.getStatus() == OrderStatus.SHIPPED) {
            order.updateStatus(OrderStatus.DELIVERED);
        } else {
            throw new IllegalStateException("Order cannot be delivered");
        }
    }
    */
}