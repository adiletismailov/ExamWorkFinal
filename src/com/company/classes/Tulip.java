package com.company.classes;

import com.company.enums.Colour;
import com.company.enums.Country;

import java.time.LocalDate;

public class Tulip extends Flowers {
    public Tulip(Country manufacturerCountry, LocalDate shelfLifeInDays, Colour colour, int price) {
        super(manufacturerCountry, shelfLifeInDays, colour, price);
    }
}
