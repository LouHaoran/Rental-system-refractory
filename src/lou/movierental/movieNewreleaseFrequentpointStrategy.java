package lou.movierental;

public class movieNewreleaseFrequentpointStrategy implements frequentpointStrategy {
    @Override
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
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
