package com.company.classes;

import com.company.enums.Colour;
import com.company.enums.Country;

import java.time.LocalDate;

public abstract class Flowers {
    private Country manufacturerCountry;
    private LocalDate shelfLifeInDays;
    private Colour colour;
    private int price;

    public Flowers() {
    }

    public Flowers(Country manufacturerCountry, LocalDate shelfLifeInDays, Colour colour, int price) {
        this.manufacturerCountry = manufacturerCountry;
        this.shelfLifeInDays = shelfLifeInDays;
        this.colour = colour;
        this.price = price;
    }

    public Country getManufacturerCountry() {
        return manufacturerCountry;
    }

    public void setManufacturerCountry(Country manufacturerCountry) {
        this.manufacturerCountry = manufacturerCountry;
    }

    public LocalDate getShelfLifeInDays() {
        return shelfLifeInDays;
    }

    public void setShelfLifeInDays(LocalDate shelfLifeInDays) {
        this.shelfLifeInDays = shelfLifeInDays;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flowers{" +
                "\nmanufacturerCountry=" + manufacturerCountry +
                ",\nshelfLifeInDays=" + shelfLifeInDays +
                ",\ncolour=" + colour +
                ",\nprice=" + price +
                '}'+"\n";
    }
}