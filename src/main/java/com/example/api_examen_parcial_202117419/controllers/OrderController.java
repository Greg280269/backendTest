package com.example.api_examen_parcial_202117419.controllers;

import com.example.api_examen_parcial_202117419.Entities.Order;
import com.example.api_examen_parcial_202117419.dtos.CantidadPedidoDTO;
import com.example.api_examen_parcial_202117419.dtos.OrderDTO;
import com.example.api_examen_parcial_202117419.services.IOrderService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pedido")
public class OrderController {
    @Autowired
    private IOrderService ggpsIOS;

    @PostMapping("/api/orders")
    @PreAuthorize("hasAuthority('MOZO')")
    public void registrar(@RequestBody OrderDTO ggpsdto){
        ModelMapper ggpsM = new ModelMapper();
        Order ggpsOrder = ggpsM.map(ggpsdto,Order.class);
        ggpsIOS.insert(ggpsOrder);
    }

    @GetMapping("/api/sum")
    @PreAuthorize("hasAuthority('CHEF')")
    public List<CantidadPedidoDTO> cantidadPedidoPlato()
    {
        List<String[]> lista = ggpsIOS.cantidadPedidoPlato();
        List<CantidadPedidoDTO>listDTO = new ArrayList<>();
        for (String[] data: lista)
        {
            CantidadPedidoDTO dto = new CantidadPedidoDTO();
            dto.setGgpsPlatoName(data[0]);
            dto.setCantidad(Integer.parseInt(data[1]));
            listDTO.add(dto);
        }
        return listDTO;
    }
}
