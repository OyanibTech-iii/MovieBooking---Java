// Movie.java
// Represents a movie with its details. Demonstrates encapsulation by keeping fields private and providing getters.

public class Movie {
    private String title;
    private String genre;
    private int durationInMinutes;

    public Movie(String title, String genre, int durationInMinutes) {
        this.title = title;
        this.genre = genre;
        this.durationInMinutes = durationInMinutes;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    @Override
    public String toString() {
        return "Movie{" +
               "title='" + title + '\'' +
               ", genre='" + genre + '\'' +
               ", durationInMinutes=" + durationInMinutes +
               '}';
    }
}