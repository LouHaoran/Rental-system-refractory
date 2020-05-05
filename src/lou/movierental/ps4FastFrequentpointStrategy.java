package lou.movierental;

public class ps4FastFrequentpointStrategy implements frequentpointStrategy {
    @Override
    public int getPriceCode() {
        return Ps4.FAST;
    }

    @Override
    public int getFrequentRenterPoints(int numberOfDaysRented) {
        return 3;
    }
}
