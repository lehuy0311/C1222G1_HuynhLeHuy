package com.mvc.product_management.model;

public class Product {
    private int id;
    private String name;
    private String describe;
    private String price;

    public Product() {
    }

    public Product(int id, String name, String describe, String price) {
        this.id = id;
        this.name = name;
        this.describe = describe;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
