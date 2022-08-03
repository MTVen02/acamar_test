package cz.acamar.tasks;

import java.util.Arrays;

public class Task2 {

    /**
     * Task 2. Squares of a sorted array.
     * <p>
     * Given an integer array sorted in non-decreasing order,
     * return an array of the squares of each number sorted in non-decreasing order.
     * <p>
     * Example input: [-4,-1,0,3,10]
     * Expected output: [0,1,9,16,100]
     * <p>
     * Explanation: After squaring, the array becomes [16,1,0,9,100].
     * After sorting, it becomes [0,1,9,16,100].
     *
     * @param input - an integer array sorted in non-decreasing order
     * @return - an array of the squares of each number sorted in non-decreasing order
     */
    public int[] squaresOfSortedArraySimple(int[] input) {
        for (int i = 0; i < input.length; i++) {
            input[i] = input[i] * input[i];
        }

        Arrays.sort(input);
        return input;
    }

    public int[] squaresOfSortedArray(int[] input) {
        int arrLen = input.length;
        int[] resultArr = new int[arrLen];
        int startInd = 0;
        int endInd = arrLen - 1;

        for (int i = arrLen - 1; i >= 0; i--) {
            if(Math.abs(input[startInd]) < Math.abs(input[endInd])) {
                resultArr[i] = input[endInd] * input[endInd];
                endInd--;
            } else {
                resultArr[i] = input[startInd] * input[startInd];
                startInd++;
            }
        }

        return resultArr;
    }
}
