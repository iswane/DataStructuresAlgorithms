package dev.helpincode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LargestSubArrayTest {
// Given an integer array, find the largest subarray formed
// by consecutive integers. The subarray should contain all distinct values.
// For example,
// Input:  { 2, 0, 2, 1, 4, 3, 1, 0 }
// Output: The largest subarray is { 0, 2, 1, 4, 3 }

    @Test
    void when_subarray_existing_should_return_the_largest() {
        int[] integerArray = new int[]{2, 0, 2, 1, 4, 7, 3, 1, 0};
        int[] subArray = new int[]{0, 2, 1, 4, 7, 3};

        LargestSubArray largestSubArray = new LargestSubArray();
        int[] subarrayFound = largestSubArray.findSubarray(integerArray);

        assertEquals(subArray[0], subarrayFound[0]);
        assertEquals(subArray[1], subarrayFound[1]);
        assertEquals(subArray[2], subarrayFound[2]);
        assertEquals(subArray[3], subarrayFound[3]);
        assertEquals(subArray[4], subarrayFound[4]);
        assertEquals(subArray[5], subarrayFound[5]);
    }
}
