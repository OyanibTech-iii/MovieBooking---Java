// Show.java
// Represents a showtime for a movie in a theater. Manages available seats. Encapsulation with private fields.

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class Show {
    private Movie movie;
    private Theater theater;
    private LocalDateTime showTime;
    private Set<Integer> availableSeats;
    private double basePrice;

    public Show(Movie movie, Theater theater, LocalDateTime showTime, double basePrice) {
        this.movie = movie;
        this.theater = theater;
        this.showTime = showTime;
        this.basePrice = basePrice;
        this.availableSeats = new HashSet<>();
        for (int i = 1; i <= theater.getCapacity(); i++) {
            availableSeats.add(i);
        }
    }

    public Movie getMovie() {
        return movie;
    }

    public Theater getTheater() {
        return theater;
    }

    public LocalDateTime getShowTime() {
        return showTime;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public boolean isSeatAvailable(int seatNumber) {
        return availableSeats.contains(seatNumber);
    }

    public void bookSeat(int seatNumber) {
        if (!availableSeats.remove(seatNumber)) {
            throw new IllegalArgumentException("Seat " + seatNumber + " is not available.");
        }
    }

    public int getAvailableSeatsCount() {
        return availableSeats.size();
    }

    @Override
    public String toString() {
        return "Show{" +
               "movie=" + movie.getTitle() +
               ", theater=" + theater.getName() +
               ", showTime=" + showTime +
               ", availableSeats=" + getAvailableSeatsCount() +
               '}';
    }
}