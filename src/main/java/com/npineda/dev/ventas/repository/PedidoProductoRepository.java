package com.npineda.dev.ventas.repository;

import com.npineda.dev.ventas.model.PedidoProducto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface PedidoProductoRepository extends JpaRepository<PedidoProducto, Serializable> {

    int deleteByIdProducto(int id);
}
