package lou.movierental;

public class bookNewreleasePriceStrategy implements priceStrategy {
    @Override
    public int getPriceCode() {
        return 0;
    }

    @Override
    public double getCharge(int numberOfDaysRented) {
        double charge = numberOfDaysRented * 3;
        return charge;
    }

    @Override
    public int getFrequentRenterPoints(int numberOfDaysRented) {
       return 0;
    }
}
