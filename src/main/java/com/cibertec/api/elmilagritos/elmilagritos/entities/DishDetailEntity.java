package com.cibertec.api.elmilagritos.elmilagritos.entities;

public class DishDetailEntity {

    private Long id;
    private String ingrediente1;
    private String ingrediente2;
    private String ingrediente3;
    private String ingrediente4;
    private String ingrediente5;

    private DishEntity dish;

    public DishDetailEntity() {
    }

    public DishDetailEntity(DishEntity dish, Long id, String ingrediente1, String ingrediente2, String ingrediente3, String ingrediente4, String ingrediente5) {
        this.dish = dish;
        this.id = id;
        this.ingrediente1 = ingrediente1;
        this.ingrediente2 = ingrediente2;
        this.ingrediente3 = ingrediente3;
        this.ingrediente4 = ingrediente4;
        this.ingrediente5 = ingrediente5;
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
