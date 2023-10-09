package com.example.api_examen_parcial_202117419.dtos;

import com.example.api_examen_parcial_202117419.Entities.Dish;

import java.time.LocalDate;

public class OrderDTO {
    private int ggpsId;
    private String ggpsCliente;
    private int ggpsQuantity;
    private LocalDate ggpsOrderDate;
    private Dish ggpsDish;

    public int getGgpsId() {
        return ggpsId;
    }

    public void setGgpsId(int ggpsId) {
        this.ggpsId = ggpsId;
    }

    public String getGgpsCliente() {
        return ggpsCliente;
    }

    public void setGgpsCliente(String ggpsCliente) {
        this.ggpsCliente = ggpsCliente;
    }

    public int getGgpsQuantity() {
        return ggpsQuantity;
    }

    public void setGgpsQuantity(int ggpsQuantity) {
        this.ggpsQuantity = ggpsQuantity;
    }

    public LocalDate getGgpsOrderDate() {
        return ggpsOrderDate;
    }

    public void setGgpsOrderDate(LocalDate ggpsOrderDate) {
        this.ggpsOrderDate = ggpsOrderDate;
    }

    public Dish getGgpsDish() {
        return ggpsDish;
    }

    public void setGgpsDish(Dish ggpsDish) {
        this.ggpsDish = ggpsDish;
    }
}
