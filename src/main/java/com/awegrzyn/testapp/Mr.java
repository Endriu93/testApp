package com.awegrzyn.testapp;

import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mr {
    public static void main(String[] args) {
//        testDouble(args);
        System.out.println(testList());
    }

    private static void testDouble(String[] args) {
        double v = Double.parseDouble(args[0]);
        double v1 = Double.parseDouble(args[1]);
        if(v > v1)
            System.out.println("1");

        List<String> messages = Arrays.asList("a","b","c");
        messages.stream().map(StringUtils::capitalize).forEach(System.out::println); // 1 & 2
        messages.stream().map(String::length).forEach(System.out::println); // 3
        messages.stream().map(String::length).map(BigDecimal::new).forEach(System.out::println); // 4
    }

    private static List<Integer> testList() {
        List<Integer> list = new ArrayList<Integer>() {{
            add(1);
        }};
        return list;
    }
}
