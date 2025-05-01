package com.cibertec.api.elmilagritos.elmilagritos.entities;

public class DishEntity {

    private Long id;
    private String urlImage;
    private String name;
    private String description;
    private Double price;

    public DishEntity(){}

    public DishEntity(String description, Long id, String name, Double price, String urlImage) {
        this.description = description;
        this.id = id;
        this.name = name;
        this.price = price;
        this.urlImage = urlImage;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUrlImage() {
        return urlImage;
    }
    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    
}
