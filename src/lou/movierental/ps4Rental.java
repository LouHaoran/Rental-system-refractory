package lou.movierental;

public class ps4Rental {
    private Ps4 ps4;
    private int  daysRented;

    public ps4Rental(Ps4 ps4, int daysRented) {
        this.ps4      = ps4;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Ps4 getPs4() {
        return ps4;
    }

    public int getPrice(){
        return getPs4().price;
    }

    public double getCharge() {
        return getPs4().getCharge(daysRented);
    }

    public int getFrequentPoints() {
        return getPs4().getFrequentRenterPoints(daysRented);
    }
}
