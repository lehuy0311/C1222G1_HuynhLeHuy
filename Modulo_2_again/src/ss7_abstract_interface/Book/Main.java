package ss7_abstract_interface.Book;

public class Main {
    public static void main(String[] args) {
        NaturalBook naturalBook = new NaturalBook();
        NaturalBook naturalBook1 = new NaturalBook("Animal","Quốc Gia",2001,4000);
        NaturalBook naturalBook2 = new NaturalBook("Children", "Kim Đồng", 2023, 1000);
        naturalBook.add(naturalBook1);
        naturalBook.add(naturalBook2);
        naturalBook.display();

        SocialBook socialBook = new SocialBook();
        SocialBook socialBook1 = new SocialBook("World", "Quốc Tế", 2000, "Huỳnh Lê Huy");
        SocialBook socialBook2 = new SocialBook("Python", "IT", 2020, "Huỳnh Lê Huy");
        socialBook.add(socialBook1);
        socialBook.add(socialBook2);
        socialBook.display();
    }
}
