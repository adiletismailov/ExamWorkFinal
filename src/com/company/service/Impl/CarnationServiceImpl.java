package com.company.service.Impl;

import com.company.classes.Carnation;
import com.company.classes.Flowers;
import com.company.enums.Colour;
import com.company.service.FlowerService;

import java.util.*;

public class CarnationServiceImpl implements FlowerService<Carnation> {
    private List<Carnation> carnationList;

    @Override
    public String addFlowers(List<Carnation> list) {
        carnationList.addAll(list);
        return "Uspashno: ";
    }
//    hello madam my name is Kuban. What name is? Your name is simba:

    @Override
    public List<Carnation> getAllFlowers() {
        return carnationList;
    }

    @Override
    public List<Carnation> getFlowersFinByColor(String color) {
        return carnationList.stream().filter(c ->c.getColour().name().equals(color.toUpperCase())).toList();
    }

    @Override
    public Map<String, List<Carnation>> groupingFlowersByColor() {
        String a = new Scanner(System.in).nextLine();
        Map<String, List<Carnation>> listMap = new HashMap<>();
        List<Carnation> carnations = carnationList.stream().filter(c -> c.getColour().equals(Colour.RED) && c.getColour().equals(Colour.WHITE) && c.getColour().equals(Colour.YELLOW)).toList();
        listMap.put(a,carnations);
        return listMap;
    }

    @Override
    public int getSumAllFlowers() {
        int sum = 0;
        for (Carnation c:carnationList) {
            sum+=c.getPrice();
        }return sum;
    }

    @Override
    public List<Carnation> getAllFlowersSortByPrice(String ascendingOrDescending) {
        if (ascendingOrDescending.equals("ascending")){
            return carnationList.stream().sorted(Comparator.comparingInt(Flowers::getPrice)).toList();
        }else if (ascendingOrDescending.equals("descending")){
            return carnationList.stream().sorted(Comparator.comparingInt(Flowers::getPrice).reversed()).toList();
        }
        return null;
    }
}