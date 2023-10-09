package com.example.api_examen_parcial_202117419.dtos;

public class CantidadPedidoDTO {
    private String ggpsPlatoName;
    private int cantidad;

    public String getGgpsPlatoName() {
        return ggpsPlatoName;
    }

    public void setGgpsPlatoName(String ggpsPlatoName) {
        this.ggpsPlatoName = ggpsPlatoName;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
