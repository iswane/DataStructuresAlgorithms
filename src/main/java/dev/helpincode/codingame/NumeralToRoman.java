package dev.helpincode.codingame;

import java.io.Serializable;
import java.util.ArrayList;

public class NumeralToRoman implements Serializable {
    public static void main(String[] args) {

        System.out.println(numeralToRoman(3));
        System.out.println(numeralToRoman(4));
        System.out.println(numeralToRoman(5));
        System.out.println(numeralToRoman(9));
        System.out.println(numeralToRoman(1000));
        System.out.println(numeralToRoman(1001));
        System.out.println(numeralToRoman(1357));
        System.out.println(numeralToRoman(1949));
        Integer a = new Integer(3);
        Integer b = new Integer(3);
        if(a==b) {
            System.out.println(true);
        }
        System.out.println(false);


        ArrayList l = new ArrayList(2);
        l.add(1);
        l.add(1);
        l.add(1);
        System.out.println("SIZE " + l.size());

    }

    static String numeralToRoman(int num) {
        String[] letters = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] lookupValues = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder roman = new StringBuilder();
        for (int index = 0; 0 < num; index++) {
            while (num >= lookupValues[index]) {
                num -= lookupValues[index];
                roman.append(letters[index]);
            }
        }
        return roman.toString();
    }
}


