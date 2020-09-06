package com.kostas.librairie.domain;

import javax.persistence.Embeddable;

@Embeddable
public class Adresse {
    private int number;

    private String street;

    private int postalCode;

    private String city;

    public Adresse() {}

    public Adresse(int number, String street, int postalCode, String city) {
        this.number = number;
        this.street = street;
        this.postalCode = postalCode;
        this.city = city;
    }

    public int getNumber() {
        return number;
    }

    public String getStreet() {
        return street;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }
}

