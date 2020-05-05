package lou.movierental;

public class Earphone {
    public static final int REGULAR = 0;
    public static final int HIFI = 1;
    public static final int HIEND = 2;

    public String _title;
    public int price;
    private priceStrategy pricestrategy;
    private frequentpointStrategy pointstrategy;

    public Earphone(String title, int priceCode, int price) {
        this._title = title;
        setPriceCode(priceCode);
        setPrice(price);
    }

    private void setPrice(int price) {
        this.price = price;
    }

    public int getPriceCode() {
        return pricestrategy.getPriceCode();
    }


    public void setPriceCode(int priceCode) {
        switch (priceCode) {
            case REGULAR:
                pricestrategy = new earphoneRegularPriceStrategy();
                pointstrategy = new earphoneRegularFrequentpointStrategy();
                break;
            case HIFI:
                pricestrategy = new earphoneHifiPriceStrategy();
                pointstrategy = new earphoneHifiFrequentpointStrategy();
                break;
            case HIEND:
                pricestrategy = new earphoneHiendPriceStrategy();
                pointstrategy = new earphoneHiendFrequentpointStrategy();
            default:
                throw new IllegalArgumentException("illegal price code");

        }
    }

    public double getCharge(int numberOfDaysRented){
        return pricestrategy.getCharge(numberOfDaysRented);
    }

    public int getFrequentRenterPoints(int numberOfDaysRented){
        return pointstrategy.getFrequentRenterPoints(numberOfDaysRented);
    }

    public String getTitle() {
        return _title;
    }
}
