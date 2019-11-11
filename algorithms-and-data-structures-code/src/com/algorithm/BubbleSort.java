package com.algorithm;

import java.util.Arrays;

public class BubbleSort
{
    static int[] employedYears = {7, 3, 2, 9, 11, 1};

    static void bubbleSort(int[] list)
    {
        int n = list.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++)
            {
                if (list[i] > list[i + 1])
                {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped == true);
        System.out.println(Arrays.toString(list));
    }

    public static void main(String[] args)
    {
        bubbleSort(employedYears);
    }
}