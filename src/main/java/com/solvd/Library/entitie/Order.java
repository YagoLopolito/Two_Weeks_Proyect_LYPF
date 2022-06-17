package com.solvd.Library.entitie;

import java.util.Objects;

public class Order {

    private int idOrders;
    private int clientId;
    private int checkoutId;

    public Order(int idOrders, int clientId, int checkoutId) {
        this.idOrders = idOrders;
        this.clientId = clientId;
        this.checkoutId = checkoutId;
    }

    public Order(int idOrders, int clientId) {
        this.idOrders = idOrders;
        this.clientId = clientId;
    }

    public Order() {
    }

    public int getIdOrders() {
        return idOrders;
    }

    public void setIdOrders(int idOrders) {
        this.idOrders = idOrders;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getCheckoutId() {
        return checkoutId;
    }

    public void setCheckoutId(int checkoutId) {
        this.checkoutId = checkoutId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "idOrders=" + idOrders +
                ", clientId=" + clientId +
                ", checkoutId=" + checkoutId +
                '}';
    }
}
