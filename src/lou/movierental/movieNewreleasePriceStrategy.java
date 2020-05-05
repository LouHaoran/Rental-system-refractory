package lou.movierental;

public class movieNewreleasePriceStrategy implements priceStrategy {
    @Override
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    public double getCharge(int numberOfDaysRented) {
        double charge = numberOfDaysRented * 3;
        return charge;
    }

    @Override
    public int getFrequentRenterPoints(int numberOfDaysRented) {
        if (numberOfDaysRented > 1) {
            return 2;
        } else {
            return 1;
        }
    }
}
