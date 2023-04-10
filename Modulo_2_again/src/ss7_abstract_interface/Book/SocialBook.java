package ss7_abstract_interface.Book;

import java.util.ArrayList;
import java.util.List;

public class SocialBook extends  Book{
    private String author;

    public SocialBook(String name, String producer, int year, String author) {
        super(name, producer, year);
        this.author = author;
    }

    public SocialBook() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String toWrite() {
        return super.getName()+","+super.getProducer()+","+super.getYear()+","+this.getAuthor();
    }

    List<SocialBook> socialBooks = new ArrayList<SocialBook>();

    public void add(SocialBook socialBook) {
        socialBooks.add(socialBook);
    }

    public void display() {
        for (SocialBook socialBook: socialBooks){
            System.out.println(socialBook.toWrite());
        }
    }
}
