package com.dmtechpro;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class JavaStream {

    public static void sample1(){
        List<Integer> nums = List.of(1,4,5,6,7,8,9);
        int sum = nums.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Result :: " + sum);
    }

    public static void secondLongestWords(){
        String sen = "Checking the second longest words in the sentence";
        List<String> words =  Arrays.asList(sen.split("\\s+"));
        System.out.println("List of words :: "+ words);
        List<Integer> wordLenths = words.stream().map(String::length).toList();
        System.out.println("String with length :: "+ wordLenths);
        System.out.println("Sorted list :: "+ wordLenths.stream().sorted().distinct().toList());
        int secondLongestWord = Arrays.asList(sen.split("\\s+")).stream().map(String::length).sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get();
        System.out.println("Result :: " + secondLongestWord);
    }
}
