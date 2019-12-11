package com.awegrzyn.testapp;

import java.math.BigDecimal;

public class BigDecimalTest {

    public static void main(String[] args) {
        double result = multiBigDecimal(1.00001, 10.1);
        double resultdouble = multiDouble(1.00001, 10.1);
        System.out.println(result);
        System.out.println(resultdouble);
        double div_big = divideBigDecimal(1.00001, 10.1);
        double div_double = divideDouble(1.00001, 10.1);
        System.out.println(div_big);
        System.out.println(div_double);
        System.out.println(BigDecimal.valueOf(div_double));
    }

    private static double multiBigDecimal(double val, double multi) {
        BigDecimal one = BigDecimal.valueOf(val);
        BigDecimal two = BigDecimal.valueOf(multi);
        return one.multiply(two).doubleValue();
    }

    private static double multiDouble(double val, double multi) {
        return val * multi;
    }

    private static double divideBigDecimal(double val, double multi) {
        BigDecimal one = BigDecimal.valueOf(val);
        BigDecimal two = BigDecimal.valueOf(multi);
        return one.divide(two,6,BigDecimal.ROUND_HALF_DOWN).doubleValue();
    }

    private static double divideDouble(double val, double multi) {
        return val/multi;
    }
}
