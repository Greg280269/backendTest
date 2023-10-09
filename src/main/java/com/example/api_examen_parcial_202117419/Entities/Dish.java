package com.example.api_examen_parcial_202117419.Entities;

import javax.persistence.*;

@Entity
@Table(name = "plato")
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ggpsId;
    @Column (name = "ggpsName")
    private String ggpsName;
    @Column (name = "ggpsDescription")
    private String ggpsDescription;
    @Column(name = "ggpsPrice")
    private Double ggpsPrice;
    @Column(name = "ggpsCategory")
    private String ggpsCategory;

    public Dish() {
    }

    public Dish(int ggpsId, String ggpsName, String ggpsDescription, Double ggpsPrice, String ggpsCategory) {
        this.ggpsId = ggpsId;
        this.ggpsName = ggpsName;
        this.ggpsDescription = ggpsDescription;
        this.ggpsPrice = ggpsPrice;
        this.ggpsCategory = ggpsCategory;
    }

    public int getGgpsId() {
        return ggpsId;
    }

    public void setGgpsId(int ggpsId) {
        this.ggpsId = ggpsId;
    }

    public String getGgpsName() {
        return ggpsName;
    }

    public void setGgpsName(String ggpsName) {
        this.ggpsName = ggpsName;
    }

    public String getGgpsDescription() {
        return ggpsDescription;
    }

    public void setGgpsDescription(String ggpsDescription) {
        this.ggpsDescription = ggpsDescription;
    }

    public Double getGgpsPrice() {
        return ggpsPrice;
    }

    public void setGgpsPrice(Double ggpsPrice) {
        this.ggpsPrice = ggpsPrice;
    }

    public String getGgpsCategory() {
        return ggpsCategory;
    }

    public void setGgpsCategory(String ggpsCategory) {
        this.ggpsCategory = ggpsCategory;
    }
}
