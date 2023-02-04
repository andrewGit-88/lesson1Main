package Pages;

public abstract class BooksStoreOOP {

    String bookName;
    String authorName;
    int id;
    double usdPrice;
    boolean isAvailable;

    String euro = "EUR";
    String ruble = "RUB";

    public BooksStoreOOP(String name, String authorName, int id, double price, boolean isAvailable) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.id = id;
        this.usdPrice = price;
        this.isAvailable = isAvailable;
    }


    public String getBookName() {return bookName;}

    public void setBookName(String bookName) {this.bookName = bookName;}

    public String getAuthorName() {return authorName;}

    public void setAuthorName(String authorName) {this.authorName = authorName;}

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public double getUsdPrice() {return usdPrice;}

    public void setUsdPrice(double usdPrice) {this.usdPrice = usdPrice;}

    public boolean isAvailable() {return isAvailable;}

    public void setAvailable(boolean available) {isAvailable = available;}

    public double convertPrice(String currency) {
        double rate = 1;
        if (currency.equals(euro)) {
            rate = 1.1;
        } else if (currency.equals(ruble)) {
            rate = 70;
        } else {
            System.out.println("Error input");
        }
        double priceAfterCoversion = usdPrice * rate;
        return priceAfterCoversion;
    }

    public void printBookDetails() {
        System.out.println("**********************");
        System.out.println("Book author name is: " + authorName);
        System.out.println("Book id is: " + id);
        System.out.println("Book price is: " + usdPrice + "USD," + convertPrice(euro) + "EUR," + convertPrice(ruble) + "RUB");
        System.out.println("Book is Available: " + isAvailable);
    }
}
