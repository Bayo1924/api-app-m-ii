package com.cibertec.api.elmilagritos.elmilagritos.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.api.elmilagritos.elmilagritos.service.IDishDetailService;
import com.cibertec.api.elmilagritos.elmilagritos.service.IDishService;


@RestController
@RequestMapping("/dishes")
public class DishController {

    private final IDishService dishService;
    private final IDishDetailService detailService;

    public DishController(IDishService dishService, IDishDetailService detailService) {
        this.dishService = dishService;
        this.detailService = detailService;
    }

    @GetMapping
    public ResponseEntity<?> getDishes() {
        return ResponseEntity.status(HttpStatus.OK).body(dishService.getAllDishes());
    }
    
    @GetMapping("/detail/{dishId}")
    public ResponseEntity<?> getDishDetailByDishId(@PathVariable Long dishId){
        return ResponseEntity.ok(detailService.getDishDetailByDishId(dishId));
    }
    

}
