package com.foodfastparadise.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodfastparadise.model.Menu;

public interface MenuRepository extends JpaRepository<Menu, Long> {
    // Aquí puedes definir métodos personalizados si los necesitas
}
