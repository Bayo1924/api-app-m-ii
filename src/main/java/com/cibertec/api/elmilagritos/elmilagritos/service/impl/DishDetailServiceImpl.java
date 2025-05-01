package com.cibertec.api.elmilagritos.elmilagritos.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cibertec.api.elmilagritos.elmilagritos.entities.DishDetailEntity;
import com.cibertec.api.elmilagritos.elmilagritos.repository.IDishDetailCrudRepository;
import com.cibertec.api.elmilagritos.elmilagritos.service.IDishDetailService;

@Service
public class DishDetailServiceImpl implements IDishDetailService{

    private final IDishDetailCrudRepository dishDetailCrudRepository;

    public DishDetailServiceImpl(IDishDetailCrudRepository dishDetailCrudRepository) {
        this.dishDetailCrudRepository = dishDetailCrudRepository;
    }

    @Override
    @Transactional(readOnly=true)
    public DishDetailEntity getDishDetailByDishId(Long dishId) {
        return dishDetailCrudRepository.findByDishId(dishId).orElseThrow(() -> new RuntimeException("No se encontro el Dish Detail"));
    }

}
