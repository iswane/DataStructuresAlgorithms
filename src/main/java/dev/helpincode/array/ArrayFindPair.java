package dev.helpincode.array;

import java.util.HashMap;
import java.util.Map;

public class ArrayFindPair {
    public boolean findPair(int[] input, int target) {
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if ((input[i] + input[j]) == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean findPairUseMap(int[] input, int target) {
        Map<Integer, Integer> mapInput = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            if (mapInput.containsValue(target - input[i])) {
                    return true;
            }
            mapInput.put(i, input[i]);
        }
        return false;
    }
}
