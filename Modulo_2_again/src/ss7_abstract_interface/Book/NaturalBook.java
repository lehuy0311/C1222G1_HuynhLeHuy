package ss7_abstract_interface.Book;

import java.util.ArrayList;
import java.util.List;

public class NaturalBook extends Book implements INaturalBook{
    private int quantity;

    public NaturalBook(){
    }

    public NaturalBook(String name, String producer, int year, int quantity) {
        super(name, producer, year);
        this.quantity = quantity;
    }
    public void setQuantity(){
    }

    public int getQuantity() {
        return quantity;
    }

    public String toWrite() {
        return super.getName()+","+super.getProducer()+","+super.getYear()+","+this.getQuantity();
    }

    List<NaturalBook> naturalBooks = new ArrayList<NaturalBook>();

    @Override
    public void add(NaturalBook naturalBook) {
        naturalBooks.add(naturalBook);
    }

    @Override
    public void display() {
        for (NaturalBook naturalBook: naturalBooks){
            System.out.println(naturalBook.toWrite());
        }
    }
}
