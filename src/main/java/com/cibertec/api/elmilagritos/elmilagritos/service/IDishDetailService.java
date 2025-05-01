package com.cibertec.api.elmilagritos.elmilagritos.service;

import com.cibertec.api.elmilagritos.elmilagritos.entities.DishDetailEntity;

public interface IDishDetailService {

    DishDetailEntity getDishDetailByDishId(Long dishId);

}
