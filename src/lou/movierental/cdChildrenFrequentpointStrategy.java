package lou.movierental;

public class cdChildrenFrequentpointStrategy implements frequentpointStrategy {
    @Override
    public int getPriceCode() {
        return Cd.CHILDRENS;
    }

    @Override
    public int getFrequentRenterPoints(int numberOfDaysRented) {
        return 1;
    }
}
