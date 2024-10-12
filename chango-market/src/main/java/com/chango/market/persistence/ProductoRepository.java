package com.chango.market.persistence;

import com.chango.market.persistence.crud.ProductoCrudRepository;
import com.chango.market.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
