package com.datastructures;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImpl
{
    public static void main(String args[])
    {
        Queue queue = new LinkedList();

        //Add value to queue
        queue.add(8); // [8]
        queue.add(12); // [8, 12]

        //Display queue
        System.out.println(queue.peek()); // prints 8

        //Add value to queue
        queue.add(16); // [8, 12, 16]

        //Delete the head
        queue.poll();

        //Display queue
        System.out.println(queue); // prints [12, 16]
    }
}