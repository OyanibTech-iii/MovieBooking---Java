// RegularTicket.java
// Inherits from Ticket. Demonstrates inheritance and polymorphism by overriding calculatePrice.

public class RegularTicket extends Ticket {
    public RegularTicket(Show show, int seatNumber) {
        super(show, seatNumber);
    }

    @Override
    protected double calculatePrice() {
        return show.getBasePrice();
    }
}