package com.simplon;

public class StringCalculator
{
    public int add(String numbers)
    {

        int res=0;
        if (numbers =="") return res;
        String[] tab = numbers.split(",");
        for ( String st: tab) {
            res= res + Integer.parseInt(st);
        }
        return res;

    }
}
