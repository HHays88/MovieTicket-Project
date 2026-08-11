public class Main {
    public static void main(String[] args) {

        String firstName = "Sandy";
        String lastName = "Jones";

        /* Instead of changing later, this automatically generates 
        a lowercase username combining first and last names. */
        String userName = (firstName + lastName).toLowerCase();

        //Instead of changing later, automatically generate movie title in uppercase.
        String movieTitle = "The Source Code".toUpperCase();

        int numberOfTickets = 8;
        double pricePerTicket = 10.57;
        double totalPrice = numberOfTickets * pricePerTicket;

        /* Instead of printing each line separately, used a text block
        with formatted() method to insert variables cleanly. */
        System.out.println("""
        Congratulations!! You have successfully booked the tickets
        Name: %s
        Username: %s
        Movie: %s
        Number of Tickets: %d
        Price per ticket: $%.2f
        Total price of %d tickets: $%.2f
        Thank you for choosing us for booking your movie tickets
        Enjoy your movie!!!""".formatted((firstName + " " + lastName), userName, movieTitle, numberOfTickets, pricePerTicket, numberOfTickets, totalPrice));
    
    }
}
