package com.company.service.Impl;

import com.company.classes.Flowers;
import com.company.classes.Rose;
import com.company.service.FlowerService;

import java.util.*;


public class RoseServiceImpl implements FlowerService<Rose> {
    List<Rose> roseList = new ArrayList<>();
    @Override
    public String addFlowers(List<Rose> list) {
        roseList.addAll(list);
        return "Uspeshno: ";
    }
    @Override
    public List<Rose> getAllFlowers() {
        return roseList;
    }
    @Override
    public List<Rose> getFlowersFinByColor(String color) {
        return roseList.stream().filter(r ->r.getColour().name().equals(color.toUpperCase())).toList();

    }

    @Override
    public Map<String, List<Rose>> groupingFlowersByColor() {
        String n = new Scanner(System.in).nextLine();
        Map<String, List<Rose>> listMap = new LinkedHashMap<>();
        List<Rose> roses = roseList.stream().filter(r -> r.getColour().name().equals(n.toUpperCase())).toList();
        listMap.put(n,roses);
        return listMap;
    }

    @Override
    public int getSumAllFlowers() {
        return roseList.stream().mapToInt(Flowers::getPrice).sum();
    }

    @Override
    public List<Rose> getAllFlowersSortByPrice(String ascendingOrDescending) {
        if (ascendingOrDescending.equalsIgnoreCase("ascending")) {
            return roseList.stream().sorted(Comparator.comparingInt(Flowers::getPrice)).toList();
        } else if (ascendingOrDescending.equalsIgnoreCase("descending")){
            return roseList.stream().sorted(Comparator.comparingInt(Flowers::getPrice).reversed()).toList();
        }
        return null;
    }
}