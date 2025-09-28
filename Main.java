// Main.java
// Entry point to demonstrate the system. Creates objects and performs bookings.

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Create movies
        Movie movie1 = new Movie("Inception", "Sci-Fi", 148);
        Movie movie2 = new Movie("The Matrix", "Action", 136);

        // Create theaters
        Theater theater1 = new Theater("Cinema Hall 1", 100);
        Theater theater2 = new Theater("Cinema Hall 2", 150);

        // Create shows
        Show show1 = new Show(movie1, theater1, LocalDateTime.of(2025, 10, 1, 18, 0), 15.0);
        Show show2 = new Show(movie2, theater2, LocalDateTime.of(2025, 10, 1, 20, 0), 12.0);

        // Create booking system
        BookingSystem system = new BookingSystem();
        system.addShow(show1);
        system.addShow(show2);

        // Create user
        User user = new User("John Doe", "john@example.com");
        system.registerUser(user);

        // Book tickets (demonstrating polymorphism)
        try {
            Ticket ticket1 = system.bookTicket(user, show1.getMovie().getTitle() + "_" + show1.getShowTime(), 5, "regular");
            System.out.println("Booked: " + ticket1);

            Ticket ticket2 = system.bookTicket(user, show2.getMovie().getTitle() + "_" + show2.getShowTime(), 10, "vip");
            System.out.println("Booked: " + ticket2);

            // Display user's tickets
            System.out.println("User's tickets:");
            for (Ticket t : user.getTickets()) {
                System.out.println(t);
            }

            // Display available seats
            System.out.println("Available seats in show1: " + show1.getAvailableSeatsCount());
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}