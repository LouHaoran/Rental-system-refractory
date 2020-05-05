package lou.movierental;

public class ps4LiteFrequentpointStrategy implements frequentpointStrategy {
    @Override
    public int getPriceCode() {
        return Ps4.LITE;
    }

    @Override
    public int getFrequentRenterPoints(int numberOfDaysRented) {
        return 1;
    }
}
