package ru.mirea.Naumov.lab12.task2;

import java.util.StringTokenizer;

public class Adress {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String flat;

    public void setAddress(String country, String region, String city, String street, String house, String building, String flat) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street;
        this.house = house;
        this.building = building;
        this.flat = flat;
    }

    public Adress() {
        this.country = null;
        this.region = null;
        this.city = null;
        this.street = null;
        this.house = null;
        this.building = null;
        this.flat = null;
    }

    public void splitAddress(String address) {
        String[] parts = address.split(",");
        setAddress(parts[0], parts[1], parts[2], parts[3], parts[4], parts[5], parts[6]);
    }

    public void tokenizeAddress(String address) {
        StringTokenizer tokenizer = new StringTokenizer(address, ",.;");
        String[] parts = new String[7];
        for (int i = 0; i < 7; i++) {
            String token = tokenizer.nextToken();
            parts[i] = token;
        }
        setAddress(parts[0], parts[1], parts[2], parts[3], parts[4], parts[5], parts[6]);
    }

    @Override
    public String toString() {
        return "Address: " +
                "country - " + country +
                ", region - " + region +
                ", city - " + city +
                ", street - " + street +
                ", house - " + house +
                ", building - " + building +
                ", flat - " + flat;
    }
}