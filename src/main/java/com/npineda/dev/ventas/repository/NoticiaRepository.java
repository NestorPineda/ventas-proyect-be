package com.npineda.dev.ventas.repository;

import com.npineda.dev.ventas.model.Noticia;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;


public interface NoticiaRepository extends JpaRepository<Noticia, Serializable> {

}
