
public class BookManagement {

    private String BookID, BookName, Quantity;
    private String Price;

    public BookManagement() {
    }

    public BookManagement(String BookID, String BookName, String Quantity, String Price) {
        this.BookID = BookID;
        this.BookName = BookName;
        this.Quantity = Quantity;
        this.Price = Price;
    }

    public String getBookID() {
        return BookID;
    }

    public void setBookID(String BookID) {
        this.BookID = BookID;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String BookName) {
        this.BookName = BookName;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

    @Override
    public String toString() {
        return BookID + "\t\t" + BookName + "\t\t" + Quantity + "\t\t" + Price;
    }

}
