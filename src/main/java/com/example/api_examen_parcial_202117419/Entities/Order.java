package com.example.api_examen_parcial_202117419.Entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "pedido")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ggpsId;
    @Column(name = "ggpsCliente")
    private String ggpsCliente;
    @Column(name = "ggpsQuantity")
    private int ggpsQuantity;
    @Column(name = "ggpsOrderDate")
    private LocalDate ggpsOrderDate;
    @ManyToOne
    @JoinColumn(name ="idDish")
    private Dish ggpsDish;

    public Order() {
    }

    public Order(int ggpsId, String ggpsCliente, int ggpsQuantity, LocalDate ggpsOrderDate, Dish ggpsDish) {
        this.ggpsId = ggpsId;
        this.ggpsCliente = ggpsCliente;
        this.ggpsQuantity = ggpsQuantity;
        this.ggpsOrderDate = ggpsOrderDate;
        this.ggpsDish = ggpsDish;
    }

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
