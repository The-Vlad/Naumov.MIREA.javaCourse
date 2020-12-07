package ru.mirea.Naumov.lab16;

// an immutable class
public final class Drink implements Item{
    private final double cost;
    private final String name;
    private final String description;

    public Drink(String name, String description){
        this.name = name;
        this.description = description;
        this.cost = 0;
    }

    public Drink(double cost, String name, String description){
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }
}
