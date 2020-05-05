package lou.movierental;

public class xboxRental {
    private Xbox xbox;
    private int  daysRented;

    public xboxRental(Xbox xbox, int daysRented) {
        this.xbox      = xbox;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Xbox getXbox() {
        return xbox;
    }

    public int getPrice(){
        return getXbox().price;
    }

    public double getCharge() {
        return getXbox().getCharge(daysRented);
    }

    public int getFrequentPoints() {
        return getXbox().getFrequentRenterPoints(daysRented);
    }
}
