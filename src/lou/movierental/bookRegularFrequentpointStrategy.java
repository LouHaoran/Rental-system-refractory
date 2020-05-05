package lou.movierental;

public class bookRegularFrequentpointStrategy implements frequentpointStrategy {
    @Override
    public int getPriceCode() {
        return Book.REGULAR;
    }

    @Override
    public int getFrequentRenterPoints(int numberOfDaysRented) {
        return 1;
    }
}
