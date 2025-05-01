package com.cibertec.api.elmilagritos.elmilagritos.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cibertec.api.elmilagritos.elmilagritos.entities.DishEntity;
import com.cibertec.api.elmilagritos.elmilagritos.repository.IDishCrudRepository;
import com.cibertec.api.elmilagritos.elmilagritos.service.IDishService;

@Service
public class DishServiceImpl implements IDishService {

    private final IDishCrudRepository dishCrudRepository;

    public DishServiceImpl(IDishCrudRepository dishCrudRepository) {
        this.dishCrudRepository = dishCrudRepository;
    }

    @Override
    @Transactional(readOnly=true)
    public List<DishEntity> getAllDishes() {
        return (List<DishEntity>) dishCrudRepository.findAll();
    }

}
