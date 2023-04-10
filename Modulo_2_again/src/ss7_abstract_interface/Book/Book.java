package ss7_abstract_interface.Book;

public abstract class Book {
    private String name;
    private String producer;
    private int year;

    public Book(String name, String producer, int year) {
        this.name = name;
        this.producer = producer;
        this.year = year;
    }
    public Book(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", year=" + year +
                '}';
    }
}
