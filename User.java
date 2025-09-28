// User.java
// Represents a user. Encapsulation applied.

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String email;
    private List<Ticket> tickets;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.tickets = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public List<Ticket> getTickets() {
        return new ArrayList<>(tickets); // Return a copy to maintain encapsulation
    }

    @Override
    public String toString() {
        return "User{" +
               "name='" + name + '\'' +
               ", email='" + email + '\'' +
               '}';
    }
}