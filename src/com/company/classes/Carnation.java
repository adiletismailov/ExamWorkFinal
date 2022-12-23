package com.company.classes;

import com.company.enums.Colour;
import com.company.enums.Country;

import java.time.LocalDate;

public class Carnation extends Flowers {
    public Carnation(Country manufacturerCountry, LocalDate shelfLifeInDays, Colour colour, int price) {
        super(manufacturerCountry, shelfLifeInDays, colour, price);
    }
    public Carnation() {
    }
}
