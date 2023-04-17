package ss10_list.fruit_management.model;

public class Fruit {
    private String nameFruit;
    private String typeFruit;
    private String dateProduct;
    private String expiry;
    private String source;
    private String price;

    public Fruit() {
    }

    public Fruit(String nameFruit, String typeFruit, String dateProduct, String expiry, String source, String price) {
        this.nameFruit = nameFruit;
        this.typeFruit = typeFruit;
        this.dateProduct = dateProduct;
        this.expiry = expiry;
        this.source = source;
        this.price = price;
    }

    public String getNameFruit() {
        return nameFruit;
    }

    public void setNameFruit(String nameFruit) {
        this.nameFruit = nameFruit;
    }

    public String getTypeFruit() {
        return typeFruit;
    }

    public void setTypeFruit(String typeFruit) {
        this.typeFruit = typeFruit;
    }

    public String getDateProduct() {
        return dateProduct;
    }

    public void setDateProduct(String dateProduct) {
        this.dateProduct = dateProduct;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "nameFruit='" + nameFruit + '\'' +
                ", typeFruit='" + typeFruit + '\'' +
                ", dateProduct='" + dateProduct + '\'' +
                ", hanSuDung='" + expiry + '\'' +
                ", source='" + source + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
