package com.datastructures;

import java.util.Stack;

public class StackImpl
{
    public static void main(String args[])
    {
        Stack stack = new Stack();

        // Add values to the stack
        stack.push(8); // [8]
        stack.push(12); // [8, 12]

        // Displaying the stack
        System.out.println(stack.peek()); // prints 8

        // Add value to the stack
        stack.push(16); // [8, 12, 16]

        // Casting stack.pop() value to int and remove last in
        int x = (int) stack.pop();

        // Displaying the stack
        System.out.println(x); // prints 16
        System.out.println(stack); // prints [8, 12]
    }
}
