package com.cibertec.api.elmilagritos.elmilagritos.controller;

import com.cibertec.api.elmilagritos.elmilagritos.entities.DishDetailEntity;
import com.cibertec.api.elmilagritos.elmilagritos.entities.DishEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("/dishes")
public class DishController {

    private final List<DishEntity> dishes = Arrays.asList(
            new DishEntity("Pizza italiana con masa artesanal y pepperoni", 1L, "Pizza Pepperoni", 25.0, "https://www.sortirambnens.com/wp-content/uploads/2019/02/pizza-de-peperoni.jpg"),
            new DishEntity("Hamburguesa doble con queso cheddar y papas", 2L, "Hamburguesa Doble", 18.5, "https://www.recetasnestle.com.ec/sites/default/files/srh_recipes/4e4293857c03d819e4ae51de1e86d66a.jpg"),
            new DishEntity("Pollo a la brasa", 3L, "Rico pollo a la brasa", 20.5, "https://buenazo.cronosmedia.glr.pe/original/2023/07/14/64ac3e8c599470217672a906.jpg"),
            new DishEntity("Pollo al horno", 4L, "Rico pollo al horno", 20.5, "https://www.recetasnestle.com.pe/sites/default/files/srh_recipes/6b9aa49f5d86110b6cf03136f4aa6d3f.jpg")
    );

    private final List<DishDetailEntity> dishDetails = Arrays.asList(
            new DishDetailEntity(dishes.get(0), 101L, "Masa artesanal", "Salsa de tomate", "Queso mozzarella", "Pepperoni", "Orégano"),
            new DishDetailEntity(dishes.get(1), 102L, "Pan artesanal", "Carne de res", "Queso cheddar", "Papas fritas", "Salsa especial"),
            new DishDetailEntity(dishes.get(2), 103L, "Salmón fresco", "Arroz japonés", "Alga nori", "Salsa de soja", "Wasabi"),
            new DishDetailEntity(dishes.get(3), 104L, "Lechuga romana", "Pollo a la parrilla", "Queso parmesano", "Crutones", "Aderezo César")
    );

    @GetMapping
    public ResponseEntity<List<DishEntity>> getDishes() {
        return ResponseEntity.ok(dishes);
    }

    @GetMapping("/detail/{dishId}")
    public ResponseEntity<DishDetailEntity> getDishDetailByDishId(@PathVariable Long dishId) {
        return dishDetails.stream()
                .filter(detail -> detail.getDish().getId().equals(dishId))
                .findFirst()
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

}
