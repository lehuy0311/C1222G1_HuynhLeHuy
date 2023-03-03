package MVC.model;

public class Manga{
    private int id;
    private String name;
    private String  author;
    private String offer;

    public Manga() {
    }

    public Manga(int id, String name, String author, String offer) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.offer = offer;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getOffer() {
        return offer;
    }

    public void setOffer(String offer) {
        this.offer = offer;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", offer='" + offer + '\'' +
                '}';
    }
}

