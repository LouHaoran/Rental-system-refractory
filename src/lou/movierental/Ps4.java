package lou.movierental;

public class Ps4 {
    public static final int FAST = 2;
    public static final int REGULAR = 0;
    public static final int LITE = 1;

    private String _title;
    public int price;
    private priceStrategy pricestrategy;
    private frequentpointStrategy pointstrategy;

    public Ps4(String title, int priceCode, int price) {
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
                pricestrategy = new ps4RegularPriceStrategy();
                pointstrategy = new ps4RegularFrequentpointStrategy();
                break;
            case FAST:
                pricestrategy = new ps4FastPriceStrategy();
                pointstrategy = new ps4FastFrequentpointStrategy();
                break;
            case LITE:
                pricestrategy = new ps4LitePriceStrategy();
                pointstrategy = new ps4LiteFrequentpointStrategy();


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