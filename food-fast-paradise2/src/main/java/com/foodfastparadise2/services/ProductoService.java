package com.foodfastparadise.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodfastparadise.model.Producto;
import com.foodfastparadise.repository.ProductoRepository;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> getAllProductos() {
        return productoRepository.findAll();
    }

    public Producto saveProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    // Otros métodos
}
