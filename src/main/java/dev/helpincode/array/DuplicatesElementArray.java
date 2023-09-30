package dev.helpincode.array;

public class DuplicatesElementArray {
    public int findDuplicateElement(int[] input) {
        boolean[] visited = new boolean[input.length + 1];

        for (int value : input) {
            if (visited[value]) {
                return value;
            }
            visited[value] = true;
        }
         return -1;
    }
}
