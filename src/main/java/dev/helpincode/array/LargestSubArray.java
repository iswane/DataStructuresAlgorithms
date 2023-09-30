package dev.helpincode.array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LargestSubArray {
    public int[] findSubarray(int[] integerArray) {
        Map<Integer, Integer> arrayToMap = new HashMap<>();
        List<Integer[]> memMapToListArray = new ArrayList<>();
        List<Integer> memMapSize = new ArrayList<>();
        Integer max = 0;
        for (int i = 0; i < integerArray.length; i++) {
            if (arrayToMap.containsValue(integerArray[i])) {
                Integer key = getKeyWithValue(arrayToMap, integerArray[i]);
                for (int j = key; j >= 0; j--) {
                    arrayToMap.remove(j);
                }
                arrayToMap.put(i, integerArray[i]);
            } else {
                arrayToMap.put(i, integerArray[i]);
            }

            memMapSize.add(arrayToMap.size());
            max = Collections.max(memMapSize);

            Collection<Integer> values = arrayToMap.values();
            Integer[] array = values.toArray(values.toArray(new Integer[0]));
            memMapToListArray.add(array);
        }

        final Integer finalMax = max;
        List<Integer> collectLargestList = memMapToListArray
                .stream()
                .filter(memA -> finalMax.equals(memA.length)).flatMap(Stream::of)
                .collect(Collectors.toList());

        return collectLargestList.stream().mapToInt(Integer::intValue).toArray();
    }

    private static Integer getKeyWithValue(Map<Integer, Integer> arrayToMap, int value) {
        return arrayToMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue().equals(value))
                .map(Map.Entry::getKey)
                .findFirst()
                .get();
    }
}
