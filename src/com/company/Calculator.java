package com.company;

/**
 * Created by NCC on 03/02/2017.
 */
public class Calculator {
    public int evaluate(String expression) {
        int sum = 0;
        for (String summand: expression.split("\\+"))
            sum += Integer.valueOf(summand);
        return sum+1;
    }
}
