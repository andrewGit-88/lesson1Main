package lesson1;

public class Book {
    //describe an item, create all variables we need
    //name, author,id, price in USD, availability
    //using conversion rate, calculate Eur Price of Book
    //print all the books details including prices

    public static void main(String[] args) {
//        String bookname = "Harry Potter";
//        String authorname = "J.K.Rowling";
//        int id = 1;
//        double priceinUSD = 12.5;
//        boolean isAvailable = true;

        Book book1 = new Book();
        book1.createNewBook("Harry Potter", "J.K.Rowling",1,10.5,  false);
        book1.createNewBook("Anna Karenina", "L.Tolstoy",2,12.5,  true);




    }

    public void createNewBook(String bookname, String authorname, int id, double priceinUSD, boolean isAvailable){
        double rate = 1.1;
        double priceinEUR = priceinUSD * rate;

        System.out.println("Book Name: " + bookname);
        System.out.println("Author Name: " + authorname);
        System.out.println("Book id is: " + id);
        System.out.println("Book Price: " + priceinUSD + "USD, " + priceinEUR + "EUR");
        System.out.println("Book is available:" + isAvailable);
        System.out.println(" ");


    }
}
