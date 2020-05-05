package lou.movierental;

public class earphoneRental {
    private Earphone earphone;
    private int  daysRented;

    public earphoneRental(Earphone earphone, int daysRented) {
        this.earphone      = earphone;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Earphone getEarphone() {
        return earphone;
    }

    public int getPrice(){
        return getEarphone().price;
    }

    public double getCharge() {
        return getEarphone().getCharge(daysRented);
    }

    public int getFrequentPoints() {
        return getEarphone().getFrequentRenterPoints(daysRented);
    }
}
