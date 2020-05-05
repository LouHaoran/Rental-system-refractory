package lou.movierental;

public class Movie {

    public static final int CHILDRENS   = 2;
    public static final int REGULAR     = 0;
    public static final int NEW_RELEASE = 1;
    
    private String _title;
    public int price;
    private priceStrategy pricestrategy;
    private frequentpointStrategy pointstrategy;
    
    public Movie(String title, int priceCode,int price) {
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
    
//    public void setPriceCode(int priceCode) {
//        switch(priceCode){
//            case REGULAR:
//                price = new RegularPrice();
//                break;
//            case CHILDRENS:
//                price = new ChildrensPrice();
//                break;
//            case NEW_RELEASE:
//                price = new NewreleasePrice();
//            default:
//                throw new IllegalArgumentException("illegal price code");
//
//        }
//    }

    public void setPriceCode(int priceCode) {
        switch(priceCode){
            case REGULAR:
                pricestrategy = new movieRegularPriceStrategy();
                pointstrategy = new movieRegularFrequentpointStrategy();
                break;
            case CHILDRENS:
                pricestrategy = new movieChlidrenPriceStrategy();
                pointstrategy = new movieChildrenFrequentpointStrategy();
                break;
            case NEW_RELEASE:
                pricestrategy = new movieNewreleasePriceStrategy();
                pointstrategy = new movieNewreleaseFrequentpointStrategy();
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