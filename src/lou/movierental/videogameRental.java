package lou.movierental;

public class videogameRental {
    private Videogame videogame;
    private int  daysRented;

    public videogameRental(Videogame videogame, int daysRented) {
        this.videogame      = videogame;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Videogame getVideogame() {
        return videogame;
    }

    public int getPrice(){
        return getVideogame().price;
    }

    public double getCharge() {
        return getVideogame().getCharge(daysRented);
    }

    public int getFrequentPoints() {
        return getVideogame().getFrequentRenterPoints(daysRented);
    }
}
