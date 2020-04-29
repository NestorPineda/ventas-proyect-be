package com.npineda.dev.ventas.repository;

import com.npineda.dev.ventas.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface PedidoRepository extends JpaRepository<Pedido, Serializable> {

    int deleteByIdVendedor(int id);

}
