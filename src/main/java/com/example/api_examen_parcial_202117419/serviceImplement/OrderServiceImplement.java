package com.example.api_examen_parcial_202117419.serviceImplement;

import com.example.api_examen_parcial_202117419.Entities.Order;
import com.example.api_examen_parcial_202117419.repositories.IOrderRepository;
import com.example.api_examen_parcial_202117419.services.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImplement implements IOrderService {
    @Autowired
    private IOrderRepository ggpsIOR;


    @Override
    public void insert(Order ggpsOrder) {
        ggpsIOR.save(ggpsOrder);
    }

    @Override
    public List<String[]> cantidadPedidoPlato() {
        return ggpsIOR.cantidadPedidoPlato();
    }
}
