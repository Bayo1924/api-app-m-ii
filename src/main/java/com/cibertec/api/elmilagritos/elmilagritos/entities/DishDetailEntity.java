package com.cibertec.api.elmilagritos.elmilagritos.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="dish_detail")
public class DishDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ingrediente1;
    private String ingrediente2;
    private String ingrediente3;
    private String ingrediente4;
    private String ingrediente5;

    @OneToOne
    @JoinColumn(name = "dish_id")
    private DishEntity dish;

    public DishDetailEntity() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getIngrediente1() {
        return ingrediente1;
    }
    public void setIngrediente1(String ingrediente1) {
        this.ingrediente1 = ingrediente1;
    }
    public String getIngrediente2() {
        return ingrediente2;
    }
    public void setIngrediente2(String ingrediente2) {
        this.ingrediente2 = ingrediente2;
    }
    public String getIngrediente3() {
        return ingrediente3;
    }
    public void setIngrediente3(String ingrediente3) {
        this.ingrediente3 = ingrediente3;
    }
    public String getIngrediente4() {
        return ingrediente4;
    }
    public void setIngrediente4(String ingrediente4) {
        this.ingrediente4 = ingrediente4;
    }
    public String getIngrediente5() {
        return ingrediente5;
    }
    public void setIngrediente5(String ingrediente5) {
        this.ingrediente5 = ingrediente5;
    }
    public DishEntity getDish() {
        return dish;
    }
    public void setDish(DishEntity dish) {
        this.dish = dish;
    }

}
