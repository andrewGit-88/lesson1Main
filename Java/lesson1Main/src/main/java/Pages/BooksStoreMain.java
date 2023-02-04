package Pages;

public class BooksStoreMain {
    public static void main(String[] args) {
//        BooksStoreOOP book1 = new BooksStoreOOP("Harry Potter", "J.K.Rowling",1,10.5,  false);
//        BooksStoreOOP book2 = new BooksStoreOOP("Anna Karenina", "L.Tolstoy",2,12.5,  true);
//        book1.setUsdPrice(30);
//        book2.setAvailable(true);
//
//        book1.printBookDetails();
//        book2.printBookDetails();

        //Method @!2 Complicated where you input everything into the main, and have class BooksStoreOPP to have all attributed and methods that extend onto AudiooBooks
//          BooksStoreAudioBook book1 = new BooksStoreAudioBook("Harry Potter", "J.K.Rowling",1,10.5,  false,"mp3",128,"Smith");
//          book1.printBookDetails();
          BooksStoreEBook book2 = new BooksStoreEBook("Anna Karenina", "L.Tolstoy",2,12.5,  true,"www.hotbibbiu.com");
          book2.printBookDetails();
          book2.setUsdPrice(50);

    }
}
