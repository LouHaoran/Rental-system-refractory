package lou.movierental;

public class earphoneHiendPriceStrategy implements priceStrategy {
    @Override
    public int getPriceCode() {
        return Earphone.HIEND;
    }

    @Override
    public double getCharge(int numberOfDaysRented) {
        double charge = 20;
        if (numberOfDaysRented > 2) {
            charge += (numberOfDaysRented - 2) * 15;
        }
        return charge;
    }

    @Override
    public int getFrequentRenterPoints(int numberOfDaysRented) {
        return 12;
    }
}
