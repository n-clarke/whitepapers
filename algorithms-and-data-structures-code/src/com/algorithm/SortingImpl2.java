package com.algorithm;

import java.util.Arrays;

public class SortingImpl2
{
    static int[] employedYears = { 7, 3, 2, 9, 11, 1 };

    static void SelectionSort (int[] list)
    {
        for (int i = list.length - 1; i > 0; i --)
        {
            int index = 0, temp; //initialize to subscript of first element
            for(int j = 1; j <= i; j ++) //locate smallest element between positions 1 and i.
            {
                if(list[j] < list[index])
                    index = j;
            }
            temp = list[index]; //swap smallest found with element in position i.
            list[index] = list[i];
            list[i] = temp;
        }
        System.out.println(Arrays.toString(list));
    }

    public static void main(String[] args)
    {
        SelectionSort(employedYears);
    }
}