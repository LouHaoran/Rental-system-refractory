package lou.movierental;

public class bookChildrenFrequentpointStrategy implements frequentpointStrategy {
    @Override
    public int getPriceCode() {
        return Book.CHILDRENS;
    }

    @Override
    public int getFrequentRenterPoints(int numberOfDaysRented) {
        return 1;
    }
}
