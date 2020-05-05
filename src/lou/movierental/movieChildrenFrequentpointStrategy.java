package lou.movierental;

public class movieChildrenFrequentpointStrategy implements frequentpointStrategy {
    @Override
    public int getPriceCode() {
        return Movie.CHILDRENS;
    }

    @Override
    public int getFrequentRenterPoints(int numberOfDaysRented) {
        return 1;
    }
}
