package lou.movierental;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String _name;
    /*
    * this vector has no use for now
    * */
//    private Vector _rentals = new Vector();
    private List<movieRental> movieRentals = new ArrayList<movieRental>();
    private List<bookRental> bookRentals = new ArrayList<bookRental>();
    private List<cdRental> cdRentals = new ArrayList<cdRental>();
    private List<earphoneRental> earphoneRentals = new ArrayList<earphoneRental>();
    private List<xboxRental> xboxRentals = new ArrayList<xboxRental>();
    private List<videogameRental> videogameRentals = new ArrayList<videogameRental>();
    private List<ps4Rental> ps4Rentals = new ArrayList<ps4Rental>();

    private List<movieRental> movieSells = new ArrayList<movieRental>();
    private List<bookRental> bookSells = new ArrayList<bookRental>();
    private List<cdRental> cdSells = new ArrayList<cdRental>();
    private List<earphoneRental> earphoneSells = new ArrayList<earphoneRental>();
    private List<xboxRental> xboxSells = new ArrayList<xboxRental>();
    private List<videogameRental> videogameSells = new ArrayList<videogameRental>();
    private List<ps4Rental> ps4Sells = new ArrayList<ps4Rental>();



    
    public Customer (String name) {
        _name = name;
    }

    public String getName() {
        return _name;
    }

    //Rent item:
    public void addRentalMovie(movieRental rental) {
        movieRentals.add(rental);
    }
    public void addRentalBook(bookRental rental) {
        bookRentals.add(rental);
    }
    public void addRentalCd(cdRental rental){
        cdRentals.add(rental);
    }
    public void addRentalEarphone(earphoneRental rental) {
        earphoneRentals.add(rental);
    }
    public void addRentalXbox(xboxRental rental) {
        xboxRentals.add(rental);
    }
    public void addRentalVideogame(videogameRental rental) {
        videogameRentals.add(rental);
    }
    public void addRentalPs4(ps4Rental rental) {
        ps4Rentals.add(rental);
    }

    //Selling item:
    public void addSellsMovie(movieRental rental) {
        movieSells.add(rental);
    }
    public void addSellsBook(bookRental rental) {
        bookSells.add(rental);
    }
    public void addSellsCd(cdRental rental){
        cdSells.add(rental);
    }
    public void addSellsEarphone(earphoneRental rental) {
        earphoneSells.add(rental);
    }
    public void addSellsXbox(xboxRental rental) {
        xboxSells.add(rental);
    }
    public void addSellsVideogame(videogameRental rental) {
        videogameSells.add(rental);
    }
    public void addSellsPs4(ps4Rental rental) {
        ps4Sells.add(rental);
    }


    


    /*
    * This method is already refactored
    * to
    * createStatement

    public String Statement() {

        double      totalAmount          = 0;
        Enumeration rentals              = _rentals.elements();
        String      result               = "Rental Record for " + getName() + "\n";

        while (rentals.hasMoreElements()) {

            double rentalPrice = 0;
            Rental rental = (Rental) rentals.nextElement();

            // determine amounts for each line
            switch (rental.getMovie().getPriceCode()) {
                case Movie.REGULAR:
                    rentalPrice += 2;
                    if (rental.getDaysRented() > 2) {
                        rentalPrice += (rental.getDaysRented() - 2) * 1.5;
                    }
                    break;
                case Movie.NEW_RELEASE:
                    rentalPrice += rental.getDaysRented() * 3;
                    break;
                case Movie.CHILDRENS:
                    rentalPrice += 1.5;
                    if (rental.getDaysRented() > 3) {
                        rentalPrice += (rental.getDaysRented() - 3) * 1.5;
                    }
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + rental.getMovie().getPriceCode());
            }


            // show figures for this rental
            result += "\t" + rental.getMovie().getTitle() +
                    "\t" + String.valueOf(rentalPrice) + "\n";
            totalAmount += rentalPrice;
        }

        // add footer lines
        //result = addFooter(totalAmount, frequentRenterPoints, result);
        return result;
    }

     */
    public String createStatement(){
        String result = "Rental Record for " + getName() + "\n";

        //rent:
        result +=  "Rent Items:" + "\n";
        result = "Movie:\n";
        for (movieRental each : movieRentals) {
            // show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" + each.getCharge() + "\n";
        }
        result = "Book:\n";
        for (bookRental each : bookRentals) {
            // show figures for this rental
            result += "\t" + each.getBook().getTitle() + "\t" + each.getCharge() + "\n";
        }
        result = "Cd:\n";
        for (cdRental each : cdRentals) {
            // show figures for this rental
            result += "\t" + each.getCd().getTitle() + "\t" + each.getCharge() + "\n";
        }
        result = "Earphone:\n";
        for (earphoneRental each : earphoneRentals) {
            // show figures for this rental
            result += "\t" + each.getEarphone().getTitle() + "\t" + each.getCharge() + "\n";
        }
        result = "Xbox:\n";
        for (xboxRental each : xboxRentals) {
            // show figures for this rental
            result += "\t" + each.getXbox().getTitle() + "\t" + each.getCharge() + "\n";
        }
        result = "Ps4:\n";
        for (ps4Rental each : ps4Rentals) {
            // show figures for this rental
            result += "\t" + each.getPs4().getTitle() + "\t" + each.getCharge() + "\n";
        }
        result = "Video game:\n";
        for (videogameRental each : videogameRentals) {
            // show figures for this rental
            result += "\t" + each.getVideogame().getTitle() + "\t" + each.getCharge() + "\n";
        }

        //buy:
        result +=  "Purchased Items: \n";
        for (movieRental each : movieSells) {
            // show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" + each.getPrice() + "\n";
        }
        result = "Book:\n";
        for (bookRental each : bookSells) {
            // show figures for this rental
            result += "\t" + each.getBook().getTitle() + "\t" + each.getPrice() + "\n";
        }
        result = "Cd:\n";
        for (cdRental each : cdSells) {
            // show figures for this rental
            result += "\t" + each.getCd().getTitle() + "\t" + each.getPrice() + "\n";
        }
        result = "Earphone:\n";
        for (earphoneRental each : earphoneSells) {
            // show figures for this rental
            result += "\t" + each.getEarphone().getTitle() + "\t" + each.getPrice() + "\n";
        }
        result = "Xbox:\n";
        for (xboxRental each : xboxSells) {
            // show figures for this rental
            result += "\t" + each.getXbox().getTitle() + "\t" + each.getPrice() + "\n";
        }
        result = "Ps4:\n";
        for (ps4Rental each : ps4Sells) {
            // show figures for this rental
            result += "\t" + each.getPs4().getTitle() + "\t" + each.getPrice() + "\n";
        }
        result = "Video game:\n";
        for (videogameRental each : videogameSells) {
            // show figures for this rental
            result += "\t" + each.getVideogame().getTitle() + "\t" + each.getPrice() + "\n";
        }

        // add footer lines
        result += "Amount owed is " + getTotalCharge() + "\n";
        result += "You earned " + getTotalFrequentPoints() + " frequent renter points";
        return result;
    }

    public String createXMLStatement(){
        String result = "<name>" + getName() + "</name>";
        for (movieRental each : movieRentals) {
            // show figures for this rental
            result += "<movie>" + each.getMovie().getTitle() + "</movie><price>" + each.getCharge() + "</price>";
        }

        // add footer lines
        result += "<charge>" + getTotalCharge() + "</charge>";
        result += "<points>" + getTotalFrequentPoints() + "</points>";
        return result;
    }

    private double getTotalCharge(){
        double totalAmount = 0;
        for (movieRental rental: movieRentals) {
            totalAmount += rental.getCharge();
        }
        for (bookRental rental: bookRentals) {
            totalAmount += rental.getCharge();
        }
        for (videogameRental rental: videogameRentals) {
            totalAmount += rental.getCharge();
        }
        for (earphoneRental rental: earphoneRentals) {
            totalAmount += rental.getCharge();
        }
        for (xboxRental rental: xboxRentals) {
            totalAmount += rental.getCharge();
        }
        for (ps4Rental rental: ps4Rentals) {
            totalAmount += rental.getCharge();
        }
        for (cdRental rental: cdRentals) {
            totalAmount += rental.getCharge();
        }

        for (movieRental rental: movieSells) {
            totalAmount += rental.getPrice();
        }
        for (cdRental rental: cdSells) {
            totalAmount += rental.getPrice();
        }
        for (bookRental rental: bookSells) {
            totalAmount += rental.getPrice();
        }
        for (xboxRental rental: xboxSells) {
            totalAmount += rental.getPrice();
        }
        for (ps4Rental rental: ps4Sells) {
            totalAmount += rental.getPrice();
        }
        for (earphoneRental rental: earphoneSells) {
            totalAmount += rental.getPrice();
        }
        for (videogameRental rental: videogameSells) {
            totalAmount += rental.getPrice();
        }
        return totalAmount;
    }

    private int getTotalFrequentPoints(){
        int totalPoints = 0;
        for(movieRental rental : movieRentals){
            totalPoints += rental.getFrequentPoints();
        }
        for(bookRental rental : bookRentals){
            totalPoints += rental.getFrequentPoints();
        }
        for(cdRental rental : cdRentals){
            totalPoints += rental.getFrequentPoints();
        }
        for(xboxRental rental : xboxRentals){
            totalPoints += rental.getFrequentPoints();
        }
        for(ps4Rental rental : ps4Rentals){
            totalPoints += rental.getFrequentPoints();
        }
        for(earphoneRental rental : earphoneRentals){
            totalPoints += rental.getFrequentPoints();
        }
        for(videogameRental rental : videogameRentals){
            totalPoints += rental.getFrequentPoints();
        }
        return totalPoints;
    }




    private String addFooter(double totalAmount, int frequentRenterPoints, String result) {
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) +
                  " frequent renter points";
        return result;
    }


}