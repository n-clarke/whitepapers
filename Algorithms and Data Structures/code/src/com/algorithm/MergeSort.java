package com.algorithm;

import java.util.Arrays;

public class MergeSort
{
    static void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two sub arrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temp arrays
        int _l[] = new int [n1];
        int _r[] = new int [n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            _l[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            _r[j] = arr[m + 1+ j];

        // Initial indexes of first and second sub arrays
        int i = 0, j = 0;

        // Initial index of merged sub array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (_l[i] <= _r[j])
            {
                arr[k] = _l[i];
                i++;
            }
            else
            {
                arr[k] = _r[j];
                j++;
            }
            k++;
        }

        // If reminder exists copy elements of _l[]
        while (i < n1)
        {
            arr[k] = _l[i];
            i++;
            k++;
        }

        // If reminder exists copy elements _r[]
        while (j < n2)
        {
            arr[k] = _r[j];
            j++;
            k++;
        }
    }

    static void sort(int arr[], int l, int r)
    {
        if (l < r)
        {
            // Get the middle point in the array
            int m = (l+r)/2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr , m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    public static void main(String args[])
    {
        int[] employedYears = { 7, 8, 1, 4, 5, 6, 3, 2 };

        //Displaying Unsorted Array
        System.out.println("Unsorted Array: " + Arrays.toString(employedYears));

        //Sort Array
        sort(employedYears, 0, employedYears.length-1);

        //Display Sorted Array
        System.out.println("Sorted array: " + Arrays.toString(employedYears));
    }
}