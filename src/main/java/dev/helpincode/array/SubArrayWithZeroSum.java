package dev.helpincode.array;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithZeroSum {
    public boolean checkSubArray(int[] input) {
        Set<Integer> setArray = new HashSet<>();
        setArray.add(0);
        int sum = 0;
        for (int value : input) {
            sum += value;

            if (setArray.contains(sum)) {
                return true;
            }
            setArray.add(value);
        }
        return false;
    }
}
