package com.algorithm;

public class BinarySearch
{
    static int[] employedYears = { 1, 2, 3, 4, 5, 6, 7, 8 };

    static boolean binarySearch(int findValue, int[] list, int low, int high)
    {
        if (low > high)
        {
            System.out.println("Value has not been found.");
            return false;
        }
        int middle = (low + high) / 2;
        if (findValue == list[middle])
        {
            System.out.println("The value has been found at position: " + middle);
            return true;
        }
        else if (findValue > list[middle])
        {
            return binarySearch(findValue, list, middle+1, high);
        }
        else
        {
            return binarySearch(findValue, list, low, middle-1);
        }
    }

    public static void main(String args[])
    {
        binarySearch(7, employedYears, 0, 9);
    }
}