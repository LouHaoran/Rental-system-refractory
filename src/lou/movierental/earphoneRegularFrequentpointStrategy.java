package lou.movierental;

public class earphoneRegularFrequentpointStrategy implements frequentpointStrategy {
    @Override
    public int getPriceCode() {
        return Earphone.REGULAR;
    }

    @Override
    public int getFrequentRenterPoints(int numberOfDaysRented) {
        return 1;
    }
}
