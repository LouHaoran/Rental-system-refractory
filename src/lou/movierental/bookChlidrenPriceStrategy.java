package lou.movierental;

public class bookChlidrenPriceStrategy implements priceStrategy {
    @Override
    public int getPriceCode() {
        return Book.CHILDRENS;
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
