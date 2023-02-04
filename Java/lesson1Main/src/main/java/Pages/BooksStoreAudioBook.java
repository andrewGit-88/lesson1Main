package Pages;

public class BooksStoreAudioBook extends BooksStoreOOP{
    String format;
    int bitrate;
    String readerName;

    public BooksStoreAudioBook(String name, String authorName, int id, double price, boolean isAvailable, String format, int bitrate, String readerName) {
        super(name, authorName, id, price, isAvailable);
        this.format = format;
        this.bitrate = bitrate;
        this.readerName = readerName;
    }
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getBitrate() {
        return bitrate;
    }

    public void setBitrate(int bitrate) {
        this.bitrate = bitrate;
    }

    public String getReaderName() {
        return readerName;
    }

    public void setReaderName(String readerName) {
        this.readerName = readerName;
    }

    @Override
    public void printBookDetails() {
        super.printBookDetails();
        System.out.println("Format: " + format);
        System.out.println("Bitrate: " + bitrate);
        System.out.println("Reader Name: " + readerName);
    }
}
