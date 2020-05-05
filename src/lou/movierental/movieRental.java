package lou.movierental;

public class movieRental {
    private Movie _movie;
    private int   _daysRented;
    
    public movieRental(Movie movie, int daysRented) {
        _movie      = movie;
        _daysRented = daysRented;
    }
    
    public int getDaysRented() {
        return _daysRented;
    }
    
    public Movie getMovie() {
        return _movie;
    }

    public int getPrice(){
        return getMovie().price;
    }

    public double getCharge() {
        return getMovie().getCharge(_daysRented);
    }

    public int getFrequentPoints() {
        return getMovie().getFrequentRenterPoints(_daysRented);
    }
}