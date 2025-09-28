// BookingSystem.java
// Manages the overall system. Uses polymorphism when handling different ticket types.
// Demonstrates composition and best practices like exception handling.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookingSystem {
    private Map<String, Show> shows; // Key: unique show ID, e.g., movieTitle_showTime
    private List<User> users;

    public BookingSystem() {
        this.shows = new HashMap<>();
        this.users = new ArrayList<>();
    }

    public void addShow(Show show) {
        String showId = generateShowId(show);
        if (shows.containsKey(showId)) {
            throw new IllegalArgumentException("Show already exists.");
        }
        shows.put(showId, show);
    }

    public Show getShow(String showId) {
        return shows.get(showId);
    }

    public List<Show> getAllShows() {
        return new ArrayList<>(shows.values());
    }

    public void registerUser(User user) {
        users.add(user);
    }

    // Books a ticket polymorphically (regular or VIP)
    public Ticket bookTicket(User user, String showId, int seatNumber, String ticketType) {
        Show show = getShow(showId);
        if (show == null) {
            throw new IllegalArgumentException("Show not found.");
        }
        if (!show.isSeatAvailable(seatNumber)) {
            throw new IllegalArgumentException("Seat not available.");
        }

        Ticket ticket;
        if ("regular".equalsIgnoreCase(ticketType)) {
            ticket = new RegularTicket(show, seatNumber);
        } else if ("vip".equalsIgnoreCase(ticketType)) {
            ticket = new VipTicket(show, seatNumber);
        } else {
            throw new IllegalArgumentException("Invalid ticket type.");
        }

        show.bookSeat(seatNumber);
        user.addTicket(ticket);
        return ticket;
    }

    private String generateShowId(Show show) {
        return show.getMovie().getTitle() + "_" + show.getShowTime().toString();
    }
}