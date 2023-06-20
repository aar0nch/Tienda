package com.Tienda.dao;

import com.Tienda.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

//DAO (data access object)
public interface CategoriaDao extends JpaRepository<Categoria, Long>{
    //Mas adelante vamos a tener metodos ampliados
} 
