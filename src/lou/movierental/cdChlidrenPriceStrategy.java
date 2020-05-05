package lou.movierental;

public class cdChlidrenPriceStrategy implements priceStrategy {
    @Override
    public int getPriceCode() {
        return Cd.CHILDRENS;
    }

    @Override
    public double getCharge(int numberOfDaysRented) {
        double charge = 1.5;
        if (numberOfDaysRented > 3) {
            charge += (numberOfDaysRented - 3) * 1.5;
        }
        return charge;
    }

    @Override
    public int getFrequentRenterPoints(int numberOfDaysRented) {
        return 1;
    }
}
