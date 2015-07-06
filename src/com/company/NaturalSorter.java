package com.company;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class NaturalSorter {
    private static List<String[]> splitStringList;
    private static List<String> sortedStringList;

    public static List<String> sort(List<String> stringList) {
        NaturalComparator comparator = new NaturalComparator();

        Collections.sort(stringList, comparator);

        return stringList;
    }

    private static class NaturalComparator implements  Comparator<String>{
        @Override
        public int compare(String o1, String o2) {
            return 0;
        }
    }
}
