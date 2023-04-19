package ss12_java_collection.model;

public class Fruit {
    private String nameFruit;
    private String typeFruit;
    private String dateProduct;
    private String hanSuDung;
    private String source;
    private String price;


    public Fruit(String nameFruit, String typeFruit, String dateProduct, String hanSuDung, String source, String price) {
        this.nameFruit = nameFruit;
        this.typeFruit = typeFruit;
        this.dateProduct = dateProduct;
        this.hanSuDung = hanSuDung;
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

    public String getHanSuDung() {
        return hanSuDung;
    }

    public void setHanSuDung(String hanSuDung) {
        this.hanSuDung = hanSuDung;
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
                ", hanSuDung='" + hanSuDung + '\'' +
                ", source='" + source + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}