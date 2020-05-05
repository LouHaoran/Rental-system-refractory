package lou.movierental;

public class cdRental {
    private Cd cd;
    private int  daysRented;

    public cdRental(Cd cd, int daysRented) {
        this.cd      = cd;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Cd getCd() {
        return cd;
    }

    public double getCharge() {
        return getCd().getCharge(daysRented);
    }

    public int getPrice(){
        return getCd().price;
    }

    public int getFrequentPoints() {
        return getCd().getFrequentRenterPoints(daysRented);
    }
}
