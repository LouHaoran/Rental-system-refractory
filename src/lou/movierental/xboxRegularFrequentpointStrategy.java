package lou.movierental;

public class xboxRegularFrequentpointStrategy implements frequentpointStrategy {
    @Override
    public int getPriceCode() {
        return Xbox.REGULAR;
    }

    @Override
    public int getFrequentRenterPoints(int numberOfDaysRented) {
        return 0;
    }
}
