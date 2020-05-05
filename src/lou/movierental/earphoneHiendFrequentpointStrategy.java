package lou.movierental;

public class earphoneHiendFrequentpointStrategy implements frequentpointStrategy {
    @Override
    public int getPriceCode() {
        return Earphone.HIEND;
    }

    @Override
    public int getFrequentRenterPoints(int numberOfDaysRented) {
        return 12;
    }
}
