package com.algorithm;

public class LinearSearch
{
    static int[] employedYears = { 7, 3, 2, 9, 11, 1 };

    static void linearSearch(int[] list, int value)
    {
        int n = list.length;
        for (int i = 0; i < n; i++) {
            if (list[i] == value) {
                System.out.println("The element has been found at position: " + i);
                return;
            }
        }
        System.out.println("The element is not in the array.");
        return;
    }

    public static void main(String[] args)
    {
        //Value Exists in employedYears Array
        linearSearch(employedYears, 3);
        //Value Does Not Exist in employedYears Array
        linearSearch(employedYears, 12);
    }
}