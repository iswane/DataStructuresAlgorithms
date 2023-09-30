package dev.helpincode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubArrayWithZeroSumPrint {
    public void checkSubArray(int[] input) {
        List<Integer> subArray = new ArrayList();
        for (int value : input) {
            if (subArray.stream().reduce(0, (el1, el2) -> el1 + el2) == 0) {
                System.out.println(subArray);
            }
            subArray.add(value);
        }
    }
}
