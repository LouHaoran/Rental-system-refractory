package lou.movierental;

public class bookNewreleaseFrequentpointStrategy implements frequentpointStrategy {
    @Override
    public int getPriceCode() {
        return Book.NEW_RELEASE;
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
