package lou.movierental;

public class maintest {
    public static void main(String[] args) {
        Customer lou = new Customer("lou");

        //movie
        Movie movie1 = new Movie("Trueman's Life", 0, 20);
        Movie movie2 = new Movie("Toys",2, 30);
        //book
        Book book1 = new Book("Little Woman", 2, 30);
        Book book2 = new Book("Sunzi", 2, 50);
        //Earphone
        Earphone regular = new Earphone("AKG", 2, 20);
        Earphone hifi = new Earphone("Weston", 2, 200);
        Earphone hiend = new Earphone("Shure", 2, 20000);
//        //CD
//        Cd cd1 = new Cd("the Best of Queen", 0,5);
//        Cd cd2 = new Cd("the Best of Yanni", 1,3);
//        Cd cd3 = new Cd("the Best of Beetles", 2,4);
//        //Xbox
//        Xbox xboxlite = new Xbox("XboxLite",1,200);
//        Xbox xboxregular = new Xbox("XboxRegular",0,300);
//        Xbox xboxfast = new Xbox("XboxFast",2,400);
//        //Ps4 ps4
//        Ps4 ps4lite = new Ps4("Ps4Lite",1,200);
//        Ps4 ps4regular = new Ps4("Ps4Regular",0,300);
//        Ps4 ps4fast = new Ps4("Ps4Fast",2,400);
//        //Video game
//        Videogame vd1 = new Videogame("Mario" ,1 ,10);
//        Videogame vd2 = new Videogame("Mario1" ,0 ,20);
//        Videogame vd3 = new Videogame("Mario2" ,2 ,30);



        movieRental rental1 = new movieRental(movie1,4);
        movieRental rental2 = new movieRental(movie2, 5);
        bookRental rental3 = new bookRental(book1,6);
        earphoneRental sell4 = new earphoneRental(hifi, 0);





        lou.addRentalMovie(rental1);
        lou.addRentalMovie(rental2);
        lou.addRentalBook(rental3);

        lou.addSellsBook(rental3);
        lou.addSellsEarphone(sell4);





        String string = lou.createStatement();
        System.out.println(string);
        //String xmlstring = lou.createXMLStatement();
        //System.out.println(xmlstring);
    }
}
