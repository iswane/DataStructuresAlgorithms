package dev.helpincode.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


@DisplayName("Check if a subarray with 0 sum exists or not")
class SubArrayWithZeroSumPrintTest {
//    Check if a subarray with 0 sum exists or not
//    Given an integer array, check if it contains a subarray having zero-sum.
//            For example,
//    Input:  { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 }
//    Output: Subarray with zero-sum exists
//    The subarrays with a sum of 0 are:
//    { 3, 4, -7 }
//    { 4, -7, 3 }
//    { -7, 3, 1, 3 }
//    { 3, 1, -4 }
//    { 3, 1, 3, 1, -4, -2, -2 }
//    { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 }

    @Test
    void when_sub_array_exist_an_integer_array_should_return_true() {
        int[] input = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
        SubArrayWithZeroSumPrint subArrayWithZeroSum = new SubArrayWithZeroSumPrint();
        subArrayWithZeroSum.checkSubArray(input);
    }

    @Test
    void when_sub_array_not_exist_an_integer_array_should_return_false() {
        int[] input = { 3, 4, 7, 3, 1, 3, 1, 4, 2, 2 };
        SubArrayWithZeroSumPrint subArrayWithZeroSum = new SubArrayWithZeroSumPrint();
        subArrayWithZeroSum.checkSubArray(input);
    }
}
