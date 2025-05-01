package com.cibertec.api.elmilagritos.elmilagritos.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.cibertec.api.elmilagritos.elmilagritos.entities.DishDetailEntity;

public interface IDishDetailCrudRepository extends CrudRepository<DishDetailEntity, Long>{

    Optional<DishDetailEntity> findByDishId(Long dishId);

}
