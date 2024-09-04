package com.foodfastparadise.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodfastparadise.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    // Aquí puedes definir métodos personalizados si los necesitas
}
