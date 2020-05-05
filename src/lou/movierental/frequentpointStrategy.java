package lou.movierental;

public interface frequentpointStrategy {

    int getPriceCode();

    int getFrequentRenterPoints(int numberOfDaysRented);
}
