package dev.helpincode.codingame;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

public class RunnerClass {
    public static void main(String[] args) {

        

        A a1 = new A();
        A b1 = new B();

        System.out.println("Codingame preparation !!!");
        int i1 = 5;
        int i2 = 2;
        int i3 = i1 / i2;
        System.out.println("Resultat i3=" + i3);

        BigInteger bi = new BigInteger("1");
        bi.add(new BigInteger("1"));

        System.out.println("Resultat bi=" + bi);

        Solution s = new Solution();
        System.out.println("Solution 3 => " + Solution.count(3));
        System.out.println("Solution 4 => " + Solution.count(4));
        System.out.println("Solution 5 => " + Solution.count(5));
        System.out.println("Solution 1000 => " + s.count(1000));

        System.out.println("Resultat " + Solution.calculateTotalPrice(new int[]{4000, 7000, 2000, 1000}, 50));

        System.out.println("Somme " + Solution.sum("99.35", "1.10"));

        Solution.Planet.EARTH.equals(Solution.Planet.MERCURY);

        System.out.println("FindLargest => " + Solution.findLargest(new int[]{4, 7, 2, 7, 1}));

        System.out.println("Solve => " + Solution.solve(100, 109, 100, 20));

        System.out.println("Compute Multiples Sum => " + Solution.computeMultiplesSum(11));

        System.out.println("Concat => " + Solution.concat(new String[]{"f", "o", "o", "bar", }));

        System.out.println("ClosestToZero => " + Solution.closestToZero(new int[]{4, 7, 12, 7, 10, -7, 10, -10}));

        System.out.println("Calc => " + Solution.calc(new int[]{0, 1, 2, 3, 4, 5, 3}, 0, 1));
        System.out.println("Calc => " + Solution.calc(new int[]{0, 1, 2, 3, 4, 5, 3}, 0, 5));
        System.out.println("Calc => " + Solution.calc(new int[]{0, 1, 2, 3, 4, 5, 3}, 0, 0));
        System.out.println("Calc => " + Solution.calc(new int[]{0, 1, 2, 3, 4, 5, 3}, 0, 6));

        int i = 0;
        System.out.println("i " + i++);

        Solution.echo();

        System.out.println("FindSmallestInterval => " + Solution.findSmallestInterval(new int[]{0, 6, 4, 8, 2}));

        System.out.println("Increment => " + Solution.increment());

        System.out.println("A => " + Solution.a(1, 5));
        System.out.println("A => " + Solution.a(2, 3));
        System.out.println("A => " + Solution.a(-3, 4));

        Arrays.stream(Solution.filterDuplicates(new int[]{7, 8, 10, 7, 10, 2, 3, 6, 4, 5, 3})).forEach(System.out::println);
    }
}

class Solution {

    static int count(int n) {
        int result = 0;
        if (n >= 2 && n <= 10000) {
            for (int i = n - 1; i > 0; i--) {
                result += i;
            }
        }
        return result;
    }

    static int calculateTotalPrice(int[] prices, int discount) {
        int max = 0;
        int total = 0;
        if (discount <= 100 && prices.length < 100000) {
            max = Arrays.stream(prices)
                    .max().getAsInt();
            total = Arrays.stream(prices)
                    .sum();
        }

        return total - (max * discount / 100);
    }

    static String sum(String... numbers) {
        BigDecimal total = BigDecimal.ZERO;



        for (String number : numbers) {
            BigDecimal value = new BigDecimal(number);
            total = total.add(value);
            System.out.println(total);
        }
        return String.valueOf(total);
    }

    static int findLargest(int[] numbers) {
        return Arrays.stream(numbers)
                .max().getAsInt();
    }

    static String solve(int width, int height, int length, int mass) {


        if (encombrant(width, height, length) && lourd(mass)) {
            return "REJECTED";
        } else if (encombrant(width, height, length) || lourd(mass)) {
            return "SPECIAL";
        } else {
            return "STANDARD";
        }
    }

    static boolean encombrant(int width, int height, int length) {
        int volume = width * height * length;
        return volume >= 1_000_000 || width >= 150 || height >= 150 || length >= 150;
    }

    static boolean lourd(int mass) {
        return mass >= 20;
    }

    enum Planet {
        MERCURY, VENUS, EARTH
    }

    static int computeMultiplesSum(int n) {
        int sum = 0;
        if(n >= 0 && n <= 1_000) {
            for (int i = n; i > 0; i--) {
                if(i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                    sum += i;
                }
            }
        }
        return sum;
    }

    static String concat(String[] strings) {
        if (strings.length == 0){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String el: strings) {
            sb.append(el);
        }
        return sb.toString();
    }

    static int closestToZero(int[] ints) {
        int minValue = ints[0];
        if (ints.length == 0) {
            return 0;
        }
        for (int num : ints) {
            if(Math.abs(num) < Math.abs(minValue) || Math.abs(num) == Math.abs(minValue) && num > minValue) {
                minValue = num;
            }
        }
        return minValue;
    }

    static int calc(int[] array, int n1, int n2) {
        int sum = 0;
        if(n1 >= 0 && n1 <= n2 && n2 < array.length ) {
            for (int i = n1; i <= n2 ; i++) {
                sum += array[i];
            }
        }
        return sum;
    }

    static void echo() {
        System.out.println("Hello\nyou\n!");
    }

    static int findSmallestInterval(int[] numbers) {
        Arrays.sort(numbers);
        int smallestInterval =  Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length - 1; i++) {
            int interval = numbers[i + 1] - numbers[i];
            if (interval < smallestInterval) {
                smallestInterval = interval;
            }
        }
        return smallestInterval;
    }

    private static  int count = 0;

    static synchronized int increment() {
        count = count + 1;
        return count;
    }

    static boolean a(int i, int j) {
        return i == 1 || i + j == 1;
    }

    static int[] filterDuplicates(int[] data) {
        return Arrays
                .stream(data)
                .distinct()
                .toArray();
    }
}
