package com.example.api_examen_parcial_202117419.repositories;

import com.example.api_examen_parcial_202117419.Entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}