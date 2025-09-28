// Theater.java
// Represents a theater with name and capacity. Encapsulation applied.

public class Theater {
    private String name;
    private int capacity;

    public Theater(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Theater{" +
               "name='" + name + '\'' +
               ", capacity=" + capacity +
               '}';
    }
}