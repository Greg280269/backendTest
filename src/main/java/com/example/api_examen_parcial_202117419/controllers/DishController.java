package com.example.api_examen_parcial_202117419.controllers;

import com.example.api_examen_parcial_202117419.Entities.Dish;
import com.example.api_examen_parcial_202117419.dtos.DishDTO;
import com.example.api_examen_parcial_202117419.services.IDishService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/plato")
public class DishController {
    @Autowired
    private IDishService ggpsIDS;

    @PostMapping("/api/PachecoSalambay")
    @PreAuthorize("hasAuthority('CHEF')")
    public void registrar(@RequestBody DishDTO ggpsDTO){
        ModelMapper ggpsM = new ModelMapper();
        Dish ggpsD = ggpsM.map(ggpsDTO,Dish.class);
        ggpsIDS.insert(ggpsD);
    }
}
