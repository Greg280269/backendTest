package com.example.api_examen_parcial_202117419.services;

import com.example.api_examen_parcial_202117419.Entities.Order;

import java.util.List;

public interface IOrderService {
    public void insert(Order ggpsOrder);
    public List<String[]> cantidadPedidoPlato();
}
