package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        compare("ceva", "200l");
    }

    public static int compare(String o1, String o2) {
        Boolean compared = false;
        Pattern pattern = Pattern.compile("[0-9]+|[a-zA-Z]+|[^\\s\\w]+");
        Matcher matcher = pattern.matcher(o1);
        Matcher matcher2 = pattern.matcher(o2);


        while (matcher2.find() && matcher.find() && !compared) {
            boolean match =
        }

        if(matcher.find()) {

        } else if(matcher2.find()) {

        }

        return 0;
    }

    public static boolean isNumber (String string) {
        return false;
    }

    public static boolean isWord(String string) {
        return false;
    }

    public static boolean isSymbol(String string) {
        return false;
    }

}
