package dev.helpincode.array;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SortBinaryArrayTest {
    // Given a binary array, sort it in linear time and constant space.
    // The output should print all zeroes, followed by all ones.

    // For example,

    // Input:  { 1, 0, 1, 0, 1, 0, 0, 1 }
    // Output: { 0, 0, 0, 0, 1, 1, 1, 1 }

    @Test
    void when_binary_array_exists_should_print_all_zeroes_followed_by_all_ones_m1() {
        int[] input = { 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1 };

        SortBinaryArray sortBinaryArray = new SortBinaryArray();
        String actual = Arrays.toString(sortBinaryArray.sort(input));

        String expected  = Arrays.toString(new int[]{ 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1 });

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void when_binary_array_exists_should_print_all_zeroes_followed_by_all_ones_m2() {
        int[] input = { 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1 };

        SortBinaryArray sortBinaryArray = new SortBinaryArray();
        String actual = Arrays.toString(sortBinaryArray.sort2(input));

        String expected  = Arrays.toString(new int[]{ 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1 });

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void when_binary_array_exists_should_print_all_zeroes_followed_by_all_ones_m3() {
        int[] input = { 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1 };

        SortBinaryArray sortBinaryArray = new SortBinaryArray();
        String actual = Arrays.toString(sortBinaryArray.sort3(input));

        String expected  = Arrays.toString(new int[]{ 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1 });

        Assertions.assertEquals(expected, actual);
    }
}
