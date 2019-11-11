package com.algorithm;

import java.util.Arrays;
import java.util.Collections;

public class SortingImpl1
{
    static int[] employedYears = {7, 3, 2, 9, 11, 1};

    static int[] descIntArr(int[] arrList)
    {
        return
                Arrays
                        .stream(arrList).boxed()
                        .sorted(Collections.reverseOrder())
                        .mapToInt(Integer::intValue)
                        .toArray();
    }

    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(descIntArr(employedYears)));
    }
}
