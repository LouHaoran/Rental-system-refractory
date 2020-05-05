package lou.movierental;

public class movieRegularFrequentpointStrategy implements frequentpointStrategy {
    @Override
    public int getPriceCode() {
        return Movie.REGULAR;
    }

    @Override
    public int getFrequentRenterPoints(int numberOfDaysRented) {
        return 1;
    }
}
