package com.simplilearn.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //PriorityQueue interface and Queue is class
		Queue<Integer> integersqueue = new PriorityQueue<Integer>();
		integersqueue.add(5);
		integersqueue.add(10);
		integersqueue.add(12);
		integersqueue.add(15);
		System.out.println(integersqueue);
		// peek
		System.out.println("using peek method");
		System.out.println(integersqueue.peek());
		// poll
		System.out.println("using poll method");
		System.out.println(integersqueue.poll());
		System.out.println("After poll method");
		System.out.println(integersqueue.size());

	}

}
