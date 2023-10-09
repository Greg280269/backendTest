package com.example.api_examen_parcial_202117419.repositories;

import com.example.api_examen_parcial_202117419.Entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IOrderRepository extends JpaRepository<Order,Integer> {
    @Query(value = "Select a.ggps_name,sum(p.ggps_quantity) from pedido p\n" +
            "inner join plato a\n" +
            "on p.id_dish=a.ggps_id\n" +
            "group by a.ggps_name",nativeQuery = true)
    public List<String[]> cantidadPedidoPlato();


}
