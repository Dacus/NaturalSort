package com.company;

import java.util.List;

/**
 * Created by intern on 7/6/15.
 */
public class NaturalSorter {
    private static List<String[]> splitStringList;
    private static List<String> sortedStringList;

    public static List<String> sort(List<String> stringList) {
        for (String element : stringList) {
            element = element.toLowerCase();
            splitStringList.add(element.split(" "));
        }

        

        splitStringList.


        return stringList;
    }

    private static int Compare(String firstString, String secondString) {

    }
}
