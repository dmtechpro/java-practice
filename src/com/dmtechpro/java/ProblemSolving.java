package com.dmtechpro.java;

import java.util.Arrays;

public class ProblemSolving {

    public static void missingNumberInArray() {
        int[] nums = {1,2,3,5,4};
        int sumOfNum1 = Arrays.stream(nums).sum();
        System.out.println("Sum :: "+ sumOfNum1);
        int n = nums.length + 1;
        System.out.println("N is :: "+ n);
        int actualSum = n * (n + 1)/ 2;
        System.out.println("Actual sum :: "+ actualSum);
        int missingNum = actualSum - sumOfNum1;
        System.out.println("Missing number in the sequence is :: "+ missingNum);
    }
}
