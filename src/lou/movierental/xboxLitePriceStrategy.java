package lou.movierental;

public class xboxLitePriceStrategy implements priceStrategy {
    @Override
    public int getPriceCode() {
        return Xbox.LITE;
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
