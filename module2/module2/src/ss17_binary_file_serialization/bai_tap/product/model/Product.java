package ss17_binary_file_serialization.bai_tap.product.model;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private double price;
    private String producer;
    private String descrip;

    public Product(){
    }
    public Product(int id, String name, double price, String producer, String descrip) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.producer = producer;
        this.descrip = descrip;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", producer='" + producer + '\'' +
                ", descrip='" + descrip + '\'' +
                '}';
    }
    public String writeToCsv(){
        return id + "," + name + "," + price + "," + producer + "," + descrip;
    }
}
