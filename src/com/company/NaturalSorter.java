package com.company;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class NaturalSorter {
    public static List<String> sort(List<String> stringList) {
        NaturalComparator comparator = new NaturalComparator();

        Collections.sort(stringList, comparator);

        return stringList;
    }

    private static class NaturalComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            Boolean compared = false;

            while (!compared) {
                Pattern patter = Pattern.compile("[0-9]+|[a-zA-Z]+|[^\\s\\w]+");
                Matcher matcher = patter.matcher(o1);
                Matcher matcher2 = patter.matcher(o2);
                matcher.find();
                System.out.println(matcher.group(0));
                matcher2.find();
                System.out.println(matcher.group(0));
            }

            return 0;
        }
    }
}
