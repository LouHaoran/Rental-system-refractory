package lou.movierental;

public class cdNewreleaseFrequentpointStrategy implements frequentpointStrategy {
    @Override
    public int getPriceCode() {
        return Cd.NEW_RELEASE;
    }

    @Override
    public int getFrequentRenterPoints(int numberOfDaysRented) {
        return 1;
    }
}
