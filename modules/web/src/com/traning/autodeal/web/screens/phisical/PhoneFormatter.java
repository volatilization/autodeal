package com.traning.autodeal.web.screens.phisical;

import java.util.function.Function;

public class PhoneFormatter implements Function<String, String> {

    @Override
    public String apply(String string) {
        StringBuffer sb = new StringBuffer();
        sb.append(string.charAt(0));
        sb.append(" (");
        sb.append(string, 1, 4);
        sb.append(") ");
        sb.append(string, 4, 7);
        sb.append(" ");
        sb.append(string, 7, 9);
        sb.append(" ");
        sb.append(string, 9, 11);
        return sb.toString();
    }
}