package dev.helpincode.array;

import java.util.Arrays;

public class SortBinaryArray {
    public int[] sort(int[] input) {
        return Arrays.stream(input).sorted().toArray();
    }

    public int[] sort2(int[] input) {
        int zeros = 0;
        for (int value : input) {
            if(value == 0) {
                zeros++;
            }
        }

        int k = 0;
        while (zeros-- != 0) {
            input[k++] = 0;
        }

        while (k < input.length) {
            input[k++] = 1;
        }

        return input;
    }

    public int[] sort3(int[] input) {
        int k = 0;
        for (int value : input) {
            if(value == 0) {
                input[k++] = 0;
            }
        }

        for (int i = k; i < input.length; i++) {
            input[k++] = 1;
        }

        return input;
    }
}
