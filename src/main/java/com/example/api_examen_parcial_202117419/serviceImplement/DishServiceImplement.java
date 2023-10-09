package com.example.api_examen_parcial_202117419.serviceImplement;

import com.example.api_examen_parcial_202117419.Entities.Dish;
import com.example.api_examen_parcial_202117419.repositories.IDishRepository;
import com.example.api_examen_parcial_202117419.services.IDishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DishServiceImplement implements IDishService {
    @Autowired
    private IDishRepository ggpsIDR;
    @Override
    public void insert(Dish ggpsDish) {
        ggpsIDR.save(ggpsDish);
    }
}
