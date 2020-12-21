package ru.mirea.Naumov.lab12.task3;

public class Shirt {
    private String code;
    private String name;
    private String color;
    private String size;

    public Shirt(String str) {
        String[] parts = str.split(",");
        this.code = parts[0];
        this.name = parts[1];
        this.color = parts[2];
        this.size = parts[3];
    }

    @Override
    public String toString() {
        return "Shirt: " +
                "code - " + code +
                ", name - " + name +
                ", color - " + color +
                ", size - " + size;
    }
}