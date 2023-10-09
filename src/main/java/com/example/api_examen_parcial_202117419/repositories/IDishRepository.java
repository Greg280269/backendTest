package com.example.api_examen_parcial_202117419.repositories;

import com.example.api_examen_parcial_202117419.Entities.Dish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDishRepository extends JpaRepository<Dish,Integer> {
}
