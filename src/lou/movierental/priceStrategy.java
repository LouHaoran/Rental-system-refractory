package lou.movierental;

public interface priceStrategy {
    int getPriceCode();

    double getCharge(int numberOfDaysRented);

    int getFrequentRenterPoints(int numberOfDaysRented);
}
