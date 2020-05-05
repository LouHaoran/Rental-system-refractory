package lou.movierental;

public class Book {
    public static final int CHILDRENS   = 2;
    public static final int REGULAR     = 0;
    public static final int NEW_RELEASE = 1;

    private String _title;
    public int price;
    private priceStrategy pricestrategy;
    private frequentpointStrategy pointstrategy;

    public Book(String title, int priceCode, int price) {
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
                pricestrategy = new bookRegularPriceStrategy();
                pointstrategy = new bookRegularFrequentpointStrategy();
                break;
            case CHILDRENS:
                pricestrategy = new bookChlidrenPriceStrategy();
                pointstrategy = new bookChildrenFrequentpointStrategy();
                break;
            case NEW_RELEASE:
                pricestrategy = new bookNewreleasePriceStrategy();
                pointstrategy = new bookNewreleaseFrequentpointStrategy();
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
