package dev.helpincode.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Find a pair with the given sum in an array.")
class ArrayFindPairTest {

    // "Given an unsorted integer array, find a pair with the given sum in it.
    // For example,
    // Input:
    // nums = [8, 7, 2, 5, 3, 1]
    // target = 10
    // Output:
    // Pair found (8, 2)
    // or
    // Pair found (7, 3)
    // Input:
    // nums = [5, 2, 6, 8, 1, 9]
    // target = 12
    // Output: Pair not found


    @Test
    @DisplayName("Test with target is 2")
    void when_target_is_2_array_should_return_true() {
        int target = 2;
        int[] input = {8, 7, 1, 5, 3, 1};
        ArrayFindPair arrayFindPair = new ArrayFindPair();
        boolean pairFound = arrayFindPair.findPair(input, target);
        assertThat(pairFound).isTrue();
    }

    @Test
    @DisplayName("Test with target is 10")
    void when_target_is_10_array_should_return_pair() {
        int target = 10;
        int[] input = {8, 7, 2, 5, 3, 1};
        ArrayFindPair arrayFindPair = new ArrayFindPair();
        boolean pairFound = arrayFindPair.findPair(input, target);
        assertThat(pairFound).isTrue();
    }

    @Test
    @DisplayName("Test with target is 12")
    void when_target_is_12_array_should_return_pair() {
        int target = 12;
        int[] input = {5, 2, 6, 8, 1, 9};
        ArrayFindPair arrayFindPair = new ArrayFindPair();
        boolean pairFound = arrayFindPair.findPair(input, target);
        assertThat(pairFound).isFalse();
    }

    @Test
    @DisplayName("Test with target is 18")
    void when_target_is_18_array_should_return_pair() {
        int target = 18;
        int[] input = {9, 2, 6, 8, 10, 9};
        ArrayFindPair arrayFindPair = new ArrayFindPair();
        boolean pairFound = arrayFindPair.findPair(input, target);
        assertThat(pairFound).isTrue();
    }

    @Test
    @DisplayName("Test with target is 2 - use map")
    void when_target_is_2_array_should_return_true_use_map() {
        int target = 2;
        int[] input = {8, 7, 1, 5, 3, 1};
        ArrayFindPair arrayFindPair = new ArrayFindPair();
        boolean pairFound = arrayFindPair.findPairUseMap(input, target);
        assertThat(pairFound).isTrue();
    }

    @Test
    @DisplayName("Test with target is 10 - use map")
    void when_target_is_10_array_should_return_pair_use_map() {
        int target = 10;
        int[] input = {8, 7, 2, 5, 3, 1};
        ArrayFindPair arrayFindPair = new ArrayFindPair();
        boolean pairFound = arrayFindPair.findPairUseMap(input, target);
        assertThat(pairFound).isTrue();
    }

    @Test
    @DisplayName("Test with target is 12 - use map")
    void when_target_is_12_array_should_return_pair_use_map() {
        int target = 12;
        int[] input = {5, 2, 6, 8, 1, 9};
        ArrayFindPair arrayFindPair = new ArrayFindPair();
        boolean pairFound = arrayFindPair.findPairUseMap(input, target);
        assertThat(pairFound).isFalse();
    }

    @Test
    @DisplayName("Test with target is 18 - use map")
    void when_target_is_18_array_should_return_pair_use_map() {
        int target = 18;
        int[] input = {9, 2, 6, 8, 10, 9};
        ArrayFindPair arrayFindPair = new ArrayFindPair();
        boolean pairFound = arrayFindPair.findPairUseMap(input, target);
        assertThat(pairFound).isTrue();
    }

}
