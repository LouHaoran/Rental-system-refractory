package lou.movierental;

public class xboxFastPriceStrategy implements priceStrategy {
    @Override
    public int getPriceCode() {
        return 0;
    }

    @Override
    public double getCharge(int numberOfDaysRented) {
        double charge = 2;
        if (numberOfDaysRented > 2) {
            charge += (numberOfDaysRented - 2) * 1.5;
        }
        return charge;
    }

    @Override
    public int getFrequentRenterPoints(int numberOfDaysRented) {
        return 0;
    }
}
