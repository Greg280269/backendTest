package com.example.api_examen_parcial_202117419.dtos;

public class DishDTO {
    private int ggpsId;
    private String ggpsName;
    private String ggpsDescription;
    private Double ggpsPrice;
    private String ggpsCategory;

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
