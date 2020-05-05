package lou.movierental;

public class Cd {
    public static final int CHILDRENS   = 2;
    public static final int REGULAR     = 0;
    public static final int NEW_RELEASE = 1;

    public String _title;
    public int price;
    private priceStrategy pricestrategy;
    private frequentpointStrategy pointstrategy;

    public Cd(String title, int priceCode, int price) {
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
        switch(priceCode){
            case REGULAR:
                pricestrategy = new cdRegularPriceStrategy();
                pointstrategy = new cdRegularFrequentpointStrategy();
                break;
            case CHILDRENS:
                pricestrategy = new cdChlidrenPriceStrategy();
                pointstrategy = new cdChildrenFrequentpointStrategy();
                break;
            case NEW_RELEASE:
                pricestrategy = new cdNewreleasePriceStrategy();
                pointstrategy = new cdNewreleaseFrequentpointStrategy();
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
