package lou.movierental;

public class cdRegularFrequentpointStrategy implements frequentpointStrategy {
    @Override
    public int getPriceCode() {
        return Cd.REGULAR;
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
