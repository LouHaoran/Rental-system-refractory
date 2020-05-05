package lou.movierental;


public class bookRental {
    private Book book;
    private int  daysRented;

    public bookRental(Book book, int daysRented) {
        this.book      = book;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Book getBook() {
        return book;
    }

    public double getCharge() {
        return getBook().getCharge(daysRented);
    }

    public int getPrice(){
        return getBook().price;
    }


    public int getFrequentPoints() {
        return getBook().getFrequentRenterPoints(daysRented);
    }
}
