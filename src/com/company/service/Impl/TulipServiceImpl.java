package com.company.service.Impl;

import com.company.classes.Flowers;
import com.company.classes.Rose;
import com.company.classes.Tulip;
import com.company.service.FlowerService;

import java.util.*;

public class TulipServiceImpl implements FlowerService<Tulip> {
    private List<Tulip> tulipList = new ArrayList<>();


    @Override
    public String addFlowers(List<Tulip> list) {
        tulipList.addAll(list);
        return "Uspeshno: ";
    }

    @Override
    public List<Tulip> getAllFlowers() {
        return tulipList;
    }

    @Override
    public List<Tulip> getFlowersFinByColor(String color) {
        return tulipList.stream().filter(t -> t.getColour().name().equals(color.toUpperCase())).toList();

    }

    @Override
    public Map<String, List<Tulip>> groupingFlowersByColor() {
        String n = new Scanner(System.in).nextLine();
        Map<String, List<Tulip>> listMap = new LinkedHashMap<>();
        List<Tulip> tulipLists = tulipList.stream().filter(r -> r.getColour().name().equals(n.toUpperCase())).toList();
        listMap.put(n,tulipLists);
        return listMap;
    }

    @Override
    public int getSumAllFlowers() {
        int sum = 0;
        for (Tulip t:tulipList) {
            sum+=t.getPrice();
        }
        return sum;
    }

    @Override
    public List<Tulip> getAllFlowersSortByPrice(String ascendingOrDescending) {
        if (ascendingOrDescending.equals("ascending".toUpperCase())) {
            return tulipList.stream().sorted(Comparator.comparingInt(Flowers::getPrice)).toList();
        } else if (ascendingOrDescending.equals("descending".toUpperCase())) {
            return tulipList.stream().sorted(Comparator.comparingInt(Flowers::getPrice).reversed()).toList();
        }
        return null;
    }
}