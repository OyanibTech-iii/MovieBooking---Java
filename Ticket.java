// Ticket.java
// Abstract class for tickets. Demonstrates abstraction and serves as base for inheritance.
// Polymorphism will be shown through overridden methods in subclasses.

public abstract class Ticket {
    protected Show show;
    protected int seatNumber;
    protected double price;

    public Ticket(Show show, int seatNumber) {
        this.show = show;
        this.seatNumber = seatNumber;
        this.price = calculatePrice();
    }

    // Abstract method to be implemented by subclasses (abstraction and polymorphism)
    protected abstract double calculatePrice();

    public Show getShow() {
        return show;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Ticket{" +
               "movie='" + show.getMovie().getTitle() + '\'' +
               ", theater='" + show.getTheater().getName() + '\'' +
               ", showTime=" + show.getShowTime() +
               ", seatNumber=" + seatNumber +
               ", price=" + price +
               '}';
    }
}