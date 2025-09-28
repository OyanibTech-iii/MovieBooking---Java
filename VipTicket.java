// VipTicket.java
// Inherits from Ticket. Demonstrates inheritance and polymorphism with different price calculation.

public class VipTicket extends Ticket {
    private static final double VIP_PREMIUM = 10.0; // Additional fee for VIP

    public VipTicket(Show show, int seatNumber) {
        super(show, seatNumber);
    }

    @Override
    protected double calculatePrice() {
        return show.getBasePrice() + VIP_PREMIUM;
    }
}