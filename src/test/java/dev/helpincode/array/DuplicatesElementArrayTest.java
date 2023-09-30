package dev.helpincode.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DuplicatesElementArrayTest {
    // Find the duplicate element in a limited range array

    // Given a limited range array of size n containing elements
    // between 1 and n-1 with one element repeating, find the
    // duplicate number in it without using any extra space.

    // For example,

    //Input:  { 1, 2, 3, 4, 4 }
    //Output: The duplicate element is 4

    //Input:  { 1, 2, 3, 4, 2 }
    //Output: The duplicate element is 2

    @Test
    void when_element_duplicates_exist_should_return_element() {
        int[] input = new int[] { 1, 2, 3, 4, 4 };

        DuplicatesElementArray duplicatesElementArray = new DuplicatesElementArray();
        int duplicateElement = duplicatesElementArray.findDuplicateElement(input);
        int expected = 4;
        Assertions.assertEquals(expected, duplicateElement);
    }

    @Test
    void when_element_duplicates_exist_should_return_element_2() {
        int[] input = new int[] { 1, 2, 3, 4, 2 };

        DuplicatesElementArray duplicatesElementArray = new DuplicatesElementArray();
        int duplicateElement = duplicatesElementArray.findDuplicateElement(input);
        int expected = 2;
        Assertions.assertEquals(expected, duplicateElement);
    }
}
