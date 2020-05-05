package lou.movierental;

public class earphoneHifiFrequentpointStrategy implements frequentpointStrategy {
    @Override
    public int getPriceCode() {
        return Earphone.HIFI;
    }

    @Override
    public int getFrequentRenterPoints(int numberOfDaysRented) {
        return 1;
    }
}
