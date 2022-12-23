package com.company;

import com.company.classes.Carnation;
import com.company.classes.Flowers;
import com.company.classes.Rose;
import com.company.classes.Tulip;
import com.company.enums.Colour;
import com.company.enums.Country;
import com.company.service.FlowerService;
import com.company.service.Impl.RoseServiceImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Flower деген класс тузунуз, ичинде переменныйлар:
//        (manufacturerCountry, shelfLifeInDays, color, price)  -  (страна производитель, срок хранения в днях, цвет, цена.)
//        Flower_ди мурастаган 3  класс тузунуз
//        (мисалы:Rose, Carnation, Tulip )  -   (Роза, Гвоздика, Тюльпан)
//        FlowerService<Т> деген generic интервейс тузунуз анын ичинде төмөндөгүдөй методдор болсун.
//        String addFlowers(List<T> t);
//        List<T> getAllFlowers();
//        List<T> getFlowersFinByColor(String color);
//        Map<String, List<T>> groupingFlowersByColor();
//        int getSumAllFlowers();
//        List<T> getAllFlowersSortByPrice(String ascendingOrDescending);
//        RoseService (private List<Rose> roses) , CarnationServiceImpl(private List<Carnation> carnations),
//        TulipServiceImpl(private List<Tulip> tulip) деген класстар FlowerService_ди implement кылып методдорн реализация кылсын.

        FlowerService<Rose> flowerService = new RoseServiceImpl();


        Rose rose = new Rose(Country.BATKEN, LocalDate.ofYearDay(2021,21), Colour.RED,250);
        Rose rose1 = new Rose(Country.BATKEN, LocalDate.ofYearDay(2020,20),Colour.WHITE,250);
        Rose rose2 = new Rose(Country.BISHKEK, LocalDate.ofYearDay(2019,19),Colour.YELLOW,150);
        Rose rose3 = new Rose(Country.OSH, LocalDate.ofYearDay(2018,18),Colour.RED,200);

        Flowers tulip1 = new Tulip(Country.BATKEN,LocalDate.ofYearDay(2020,20),Colour.RED,300);
        Flowers tulip2 = new Tulip(Country.BISHKEK,LocalDate.ofYearDay(2021,21),Colour.YELLOW,250);
        Flowers tulip3 = new Tulip(Country.OSH,LocalDate.ofYearDay(2022,22),Colour.WHITE,350);

        Flowers carnation1 = new Carnation(Country.BISHKEK,LocalDate.ofYearDay(2021,21),Colour.YELLOW,100);
        Flowers carnation2 = new Carnation(Country.BATKEN,LocalDate.ofYearDay(2020,20),Colour.WHITE,50);
        Flowers carnation3 = new Carnation(Country.OSH,LocalDate.ofYearDay(2022,22),Colour.RED,130);
        List<Rose> roseList = new ArrayList<>(List.of(rose1,rose2,rose3,rose));



        while (true){
            System.out.print("""
                    1. addFlowers:
                    2. getAllFlowers:
                    3. getFlowersFinByColor:
                    4. groupingFlowersByColor:
                    5. getSumAllFlowers:
                    6. getAllFlowersSortByPrice:
                    
                    Write a command:""");
            int number = new Scanner(System.in).nextInt();
            switch (number){
                case 1 -> System.out.println(flowerService.addFlowers(roseList));
                case 2 -> System.out.println(flowerService.getAllFlowers());
                case 3 -> System.out.println(flowerService.getFlowersFinByColor(new Scanner(System.in).nextLine()));
                case 4 -> System.out.println(flowerService.groupingFlowersByColor());
                case 5 -> System.out.println(flowerService.getSumAllFlowers());
                case 6 -> System.out.println(flowerService.getAllFlowersSortByPrice(new Scanner(System.in).nextLine()));
            }
        }
    }
}
